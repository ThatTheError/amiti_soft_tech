<template>
    <Sidebar2 />
    <section id="contact">
        <div class="title-text">
            <p>Add Product</p>
            <h1>Product Details</h1>
        </div>
        <section class="contact">
            <div class="container">
                <div class="contact-form2">
                    <div id="form2">
                        <label>Product Number</label>
                        <input type="number" name="pno" v-model="pno" placeholder="Enter New Product Number">
                        <label>Product Name</label>
                        <input type="text" name="proname" v-model="pname" placeholder="Enter New Product Name">
                        <label>Product Price</label>
                        <input type="number" name="proprice" v-model="pprice" placeholder="Enter Your Email Address">
                        <input type="button" v-on:click="addItem" value="Add Item">
                    </div>
                </div>
                <div class="clearfix"></div>
            </div>
        </section>
    </section>
    <Footer />
</template>

<script>
    import axios from 'axios'
    import Sidebar2 from './Sidebar2.vue'
    import Footer from './Footer.vue'
    export default {
    name: "Add-Product",
    components: {
        Footer,
        Sidebar2
    },
    data(){
        return{
            pno:'',
            pname:'',
            pprice:''
        }
    },
    methods : {
        async addItem(){
            var data = {
                "pNo" : ""+this.pno,
                "pName" : ""+this.pname,
                "pQty" : ""+0,
                "pPrice" : ""+this.pprice
            }
            console.log(data);
            let result = await axios.post("http://localhost:8282/aproducts",data);
            if(result == "added"){
                alert("New Product Added");
            }
        }
    }
}
</script>

<style>
    
    .contact-form2 #form2 label {
        margin-right: 382px;
        color: #019587;
        margin-top: 33px;
    }
    .title-text {
        text-align: center;
        padding-bottom: 70px;
    }
    .title-text p {
        margin: auto;
        font-size: 20px;
        color: #009688;
        font-weight: bold;
        position: relative;
        display: inline-block;
        z-index: 1;
    }
    .title-text p::after {
        content: '';
        width: 50px;
        height: 35px;
        background: linear-gradient(#019587,#fff);
        position: absolute;
        top: -20px;
        left: 0;
        z-index: -1;
        transform: rotate(10deg);
        border-top-left-radius: 35px;
        border-bottom-right-radius: 35px;
    }
    .title-text h1 {
        font-size: 50px;
        color: #009688;
    }
    *{
        margin: 0 0;
        padding: 0 0;
        font-family: Arial, Helvetica, sans-serif;
    }
    
    #contact {
        width: 100%;
        padding: 70px 0;
        background: #efefef;
    }
    .title-text {
        text-align: center;
        padding-bottom: 20px;
    }
    .title-text p {
        margin: auto;
        font-size: 20px;
        color: #009688;
        font-weight: bold;
        position: relative;
        display: inline-block;
        z-index: 1;
    }
    .title-text p::after {
        content: '';
        width: 50px;
        height: 35px;
        background: linear-gradient(#019587,#fff);
        position: absolute;
        top: -20px;
        left: 0;
        z-index: -1;
        transform: rotate(10deg);
        border-top-left-radius: 35px;
        border-bottom-right-radius: 35px;
    }
    .title-text h1 {
        font-size: 50px;
    }
    .container{
        width: 80%;
        margin: 0 auto;
        padding: 1%;
    }
    .text-center{
        text-align: center;
    }
    .clearfix{
        clear: both;
        float: none;
    }
    .contact{
        background-color: #ececec;
        padding: 4% 0;
    }

    .contact-form2{
        margin-right: 50px;
        width: 500px;
        height: 308px;
        margin-left:70px;
        padding: 40px;
        float: left;
        background-color: white;
        border-radius: 15px;
    }
    #form2 input, select, textarea{
        width: 100%;
        padding: 15px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
        margin-top: 6px;
        margin-bottom: 16px;
        resize: vertical;
    }
    #form2 input[type=button]{
        margin-top: 30px;
        width: 30%;
        background: #019587;
        align-items: center;
        color: white;
        padding: 12px 47px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    #form2 input[type=button]:hover{
        background-color: rgb(61, 61, 112);
    }
</style>
