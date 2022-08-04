<template>
    <Sidebar />
    <section id="contact">
        <div class="title-text">
            <p>Contact</p>
            <h1>Connect With Us</h1>
        </div>
        <section class="contact">
            <div class="container">
                <div class="contact-form">
                    <div id="form">
                        <label for="fname">First Name</label>
                        <input type="text" name="firstname" placeholder="Enter Your FirstName">
                        <label for="lname">Last Name</label>
                        <input type="text" name="lastname" placeholder="Enter Your LastName">
                        <label for="email">Email</label>
                        <input type="text" name="email" placeholder="Enter Your Email Address">
                        <input type="submit" value="submit">
                    </div>
                </div>
                <div class="contact-form">
                    <iframe
                        src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d7529.781066180295!2d84.79737647404639!3d19.33055584776928!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x3a3d50681c41f4b9%3A0xffb9418caadf4670!2sLochapada%2C%20Brahmapur%2C%20Odisha!5e0!3m2!1sen!2sin!4v1658491604365!5m2!1sen!2sin"
                        width="500" height="400" style="border:0;" allowfullscreen="" loading="lazy"></iframe>
                </div>
                <div class="clearfix"></div>
            </div>
        </section>
    </section>
    <Footer />
</template>

<script>
    import Sidebar from './Sidebar.vue'
    import Footer from './Footer.vue'
    export default {
    name: "Contact-comp",
    components: { 
        Sidebar,
        Footer 
    }
}
</script>

<style>
    .contact-form #form label {
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

    .contact-form{
        margin-right: 50px;
        width: 500px;
        height: 400px;
        margin-left:70px;
        padding: 40px;
        float: left;
        background-color: white;
        border-radius: 15px;
    }
    #form input[type=text], select, textarea{
        width: 148%;
        padding: 12px;
        border: 1px solid #ccc;
        border-radius: 5px;
        box-sizing: border-box;
        margin-top: 6px;
        margin-bottom: 16px;
        resize: vertical;
    }
    #form input[type=submit]{
        margin-top: 20px;
        width: 30%;
        background: #019587;
        align-items: center;
        color: white;
        padding: 12px 20px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
    }
    #form input[type=submit]:hover{
        background-color: rgb(61, 61, 112);
    }
</style>