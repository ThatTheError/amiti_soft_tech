<template>
    <section id="banner">
        <img src="../assets/images/logo.png" class="logo">
        <div id="banner-text">
            <h1>Indian HairLine</h1>
            <p>All types of Haircare Product's , Hair Care , Spa , Manicures & Pedicures , Facial Treatments , Waxing</p>
            <div class="banner-btn">
                <button v-on:click="$router.push('/Products')">FindOut</button>
                <button v-on:click="$router.push('/Testimonials')">ReadMore..</button>
            </div>
        </div>
        <Sidebar />
    </section>
    <Features />
    <Services />
    <Footer />
</template>

<script>
    import Sidebar from './Sidebar.vue'
    import Features from './Features.vue'
    import Services from './Services.vue'
    import Footer from './Footer.vue'
    export default {
        name: 'Home-comp',
        components :{
            Sidebar,
            Features,
            Services,
            Footer
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
    .banner-btn {
        margin: 70px auto 0;
    }
    .banner-btn button {
        width: 150px;
        text-decoration: none;
        font-weight: bold;
        color: white;
        margin: 0 10px;
        padding: 12px 0;
        display: inline-block;
        border: 3px solid white;
        background: transparent;
        cursor: pointer;
        border-radius: 5px;
        z-index: 1;
    }
    .banner-btn button:hover {
        background-color: white;
        color: black;
    }
</style>