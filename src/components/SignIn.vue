<template>
    <body>
        <div class="signin-box">
            <div id="form">
                <h1>Login</h1>
                <label>Email :</label>
                <input type="email" placeholder="Enter Email" v-model="email" id="email">
                <label>Password :</label>
                <input type="password" placeholder="Enter Password" v-model="password" id="password">
                <button type="button" v-on:click="check" id="button">SignIn</button>
            </div>
        </div>
        <p class="para-2">Don't have an account New User ? <button v-on:click="redirection" style="color:blue;">SignUp Here</button></p>
    </body>
</template>

<script>
    import axios from 'axios'
    export default {
        name:'SignIn',
        data(){
            return {
                email:'',
                password:'',
                stored_email:'',
                stored_password:'',
                storedData:''
            }
        },
        methods : {

                  // Using JSON Server Fake API
            async check() {

                let result  = await axios.get(
                    `http://localhost:3000/users?email=${this.email}&password=${this.password}`
                );
                if(result.status == 200 && result.data.length > 0){
                    if(result.data[0].email !== this.email || result.data[0].password !== this.password){
                        alert("Not a Registered User Please Register");
                        this.$router.push('/SignUp') ;
                    }else{
                        alert("SignIn Sucessfully !!");
                        this.$router.push('/Home') ;
                    }
                }else{
                    alert("Not a Registered User Please Register");
                    this.$router.push('/SignUp') ;
                }
            },      

                    //Using LocalStorage
            /*check(){
                this.storedData = localStorage.getItem("UserCredentials");
                this.storedData = JSON.parse(this.storedData);
                this.storedData = this.storedData[this.email];
                if(this.email !== this.storedData.email || this.password !== this.storedData.password){
                    alert("Not Registered!! please register");
                    this.$router.push('SignUp') ;
                }
                else {
                    alert("signin Sucessfull !!");
                    this.$router.push('/Home') ;
                }*/


                /*this.stored_email = localStorage.getItem('email');
                this.stored_password = localStorage.getItem('password');
                if(this.email !== this.stored_email || this.password !== this.stored_password){
                    alert("Not Registered!! please register");
                    this.$router.push('SignUp') ;
                }
                else {
                    alert("signin Sucessfull !!");
                    this.$router.push('Home') ;
                }
            },*/
            redirection() {
                this.$router.push('SignUp') ;
            }
        }
   }
    
</script>

<style>
    #form label {
        display: flex;
        margin-top: 20px;
        font-size: 18px;
        color: white;
    }
    body {
        background:#efefef;
        /* background-image: url(../assets/images/signinbg3.webp); */
        font-family: 'roboto', sans-serif;
    }

    h1 {
        margin-top: 200px;
        text-align: center;
        padding-top: 15px;
        color: white;
    }

    .signin-box {
        width: 360px;
        height: 280px;
        background-color: black;
        margin: auto;
        border-radius: 9px;
    }
    .para-2 {
        text-align: center;
        color: black;
        font-weight: bolder;
        margin-top: 9px;
    }
    .para-2 button {
        border: none;
        cursor: pointer;
        font-weight: bold;
        font-size: medium;
    }
    #form {
        width: 300px;
        padding-left: 29px;
    }
    
    input {
        display: flex;
        width: 282px;
        border: none;
        padding: 7px;
        border: 2px solid gray;
        border-radius: 6px;
        outline: none;
    }

    #button {
        margin-top: 24px;
        border: none;
        width: 100%;
        height: 35px;
        justify-content: center;
        color: black;
        font-size:22px;
        background-color:aquamarine;
        cursor: pointer;
        font-weight: bold;
        border-radius:3px;
    }
    #button:hover {
        background-color:white;
        color:black;
        font-size:22px;
    }
</style>