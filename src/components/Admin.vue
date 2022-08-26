<template>
    <section id="banner">
        <img src="../assets/images/logo.png" class="logo">
        <div id="banner-text">
            <h1>Indian HairLine</h1>
            <div id="admin-img">
                <img src="https://thumbs.dreamstime.com/b/admin-sign-laptop-icon-stock-vector-166205404.jpg" class="logo" >
            </div>
        </div>
        <Sidebar2 />
    </section>
    <Footer />
</template>

<script>
    import Footer from './Footer.vue'
    import Sidebar2 from './Sidebar2.vue'
    export default {
        name: 'Admin-comp',
        components :{
            Footer,
            Sidebar2
        }
    }
</script>
<style>
    *{
        padding: 0;
        margin: 0;
    }
    #banner {
        background-image: linear-gradient(rgba(0,0,0,0.5),#009688) ,url('../assets/images/banner.jpg');
        background-size: cover;
        background-position: center;
        height: 100vh;
        position: relative;
    }
    .logo {
        position: absolute;
        top: 4%;
        left: 10%;
        width: 140px;
    }
    #banner-text {
        text-align: center;
        color: white;
        padding-top: 180px;
    }
    #banner-text h1 {
        font-size: 130px;
        font-family:Cambria, Cochin, Georgia, Times, 'Times New Roman', serif
    }
    #banner-text p {
        font-size: 20px;
        font-style: italic;
    }
    #banner-text #admin-img img{
        margin-left: 720px;
        margin-top: 423px;
        border-radius: 70px;
    }
</style>