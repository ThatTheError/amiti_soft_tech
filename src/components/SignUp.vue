<template>
    <div id="signupDiv">
        <div class="signup-box">
            <div id="form1">
                <h1>SignUp</h1>
                <label>FirstName :</label>
                <span id="fn"></span>
                <input type="text" placeholder="Enter FirstName" id="fname" required>
                <label>LastName :</label>
                <span id="ln"></span>
                <input type="text" placeholder="Enter LastName" id="lname" required>
                <label>Email :</label>
                <span id="emailspan" v-if="emailval">Invalid Email!</span>
                <input type="text" v-model="email" placeholder="Enter email" v-model.trim="email" id="email" required>
                <label>Password :</label>
                <span id="passwordspan" v-if="passval">Invalid Password</span>
                <input type="password" v-model="password" placeholder="Enter Password" v-model.trim="password" id="password" required>
                <label>Confirm Password :</label>
                <span id="confpasswordspan" v-if="confpassval">Password Mismatch</span>
                <input type="password" v-model="confpass" placeholder="Confirm Password" v-model.trim="confpass" id="confpass" required>
                <button type="button" v-on:click="signUp" id="btn">SignUp</button>
            </div>
            <p class="para-1">By clicking the signup button you agree to our <a>Term's and Condition's</a> and <a>privacy policy</a></p>
        </div>
        <p class="para-2">Already have an account ? <button v-on:click="redirection" style="color:blue">Login Here</button></p>
    </div>

</template>


<script>
    import axios from 'axios'
    export default {
        name : 'signUp',
        data() {
            return {
                email:'',
                password:'',
                confpass:'',
                v_email : /^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/,
                v_password : /^(?=.*[0-9])(?=.*[!@#$%^&])[a-zA-Z0-9!@#$%^&*]{8,16}$/,
                emailval:false,
                passval:false,
                confpassval:false,
            }
        },
        methods: {

              //Using JSON server Fake API

            /*async signUp(){
                if(!this.email.match(this.v_email)){
                    this.emailval=true
                }
                else if(!this.password.match(this.v_password)){
                    this.passval=true
                }
                else if(this.password!=this.confpass) {
                    this.confpassval=true
                }
                else{
                    let result = await axios.post("http://localhost:3000/users",{
                        email:this.email,
                        password:this.password
                    });
                    if(result.status == 201){
                        localStorage.setItem("UserInfo",JSON.stringify(result.data));
                        alert("Registered Sucessfully Now You Can SignIn");
                        this.$router.push('/') ;
                    }
                }
            },*/


            // spring boot api call
            async signUp(){
                if(!this.email.match(this.v_email)){
                    this.emailval=true
                }
                else if(!this.password.match(this.v_password)){
                    this.passval=true
                }
                else if(this.password!=this.confpass) {
                    this.confpassval=true
                }
                else{
                    var data = {
                        "uEmail" : ""+this.email,
                        "uPassword" : ""+this.password,
                        "uConfPassword" : ""+this.confpass
                    };
                    let result = await axios.post("http://localhost:8282/susers",data);
                    if(result.status == 201){
                        //localStorage.setItem("UserInfo",JSON.stringify(result.data));
                        alert("Registered Sucessfully Now You Can SignIn");
                        this.$router.push('/') ;
                    }
                    else if(result.status == 208){
                        alert("This email address is already being used!!");
                    }
                }
            },           

                        //Using localStorage 
            /*signUp(){
                if(!this.email.match(this.v_email)){
                    this.emailval=true
                }
                else if(!this.password.match(this.v_password)){
                    this.passval=true
                }
                else if(this.password!=this.confpass) {
                    this.confpassval=true
                }
                else{    
                    let uCredentials = localStorage.getItem('UserCredentials');
                    uCredentials = JSON.parse(uCredentials);
                    if(uCredentials != null){
                        if(uCredentials[this.email] == undefined) {
                            uCredentials = {
                                ...uCredentials,
                                [this.email] : {email : this.email, password : this.password}
                            }
                        }
                    }else {
                        uCredentials = {
                            [this.email] : {email : this.email, password : this.password}
                        }
                    }
                    localStorage.setItem("UserCredentials", JSON.stringify(uCredentials));
                    alert("Registered Sucessfully Now you can login");
                    this.$router.push('/') ;    
                }
            },*/
            redirection() {
                this.$router.push('/') ;
            }
        }
    }
</script>


<style>
    #signupDiv {
        background:#efefef;
        font-family: 'roboto', sans-serif;
    }
    *{
        padding: 0;
        margin: 0;
    }
    

    h1 {
        margin-top: 27px;
        text-align: center;
        padding-top: 15px;
        color: white;
    }

    .signup-box {
        width: 340px;
        height: 620px;
        background-color:white;
        margin: auto;
        border-radius: 6px;
        background-color: black;
    }
    .para-2 {
        text-align: center;
        color: black;
        font-weight: bolder;
    }
    .para-1  {
        text-align: center;
        padding-top: 20px;
        font-size: 15px;
        color: white;
    }
    #form1 {
        width: 300px;
        padding-left: 20px;
    }
    #form1 label {
        display: flex;
        margin-top: 20px;
        font-size: 18px;
        color: white;
    }

    #form1 input {
        display: flex;
        width: 283px;
        border: none;
        padding: 7px;
        border: 2px solid gray;
        border-radius: 6px;
        outline: none;
    }

    #form1 button  {
        margin-top: 34px;
        border: none;
        width: 100%;
        height: 35px;
        justify-content: center;
        color: black;
        font-size:22px;
        background-color:aquamarine;
        cursor: pointer;
        border-radius: 3px;
    }
    #form1 button:hover {
        background-color: #fff;
        color:black;
    }
    span {
        color: red;
        font-family: cursive;
        font-size: 14px;
    }


</style>