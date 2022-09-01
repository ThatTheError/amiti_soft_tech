<template> 
    <div id="sidebar" v-if="showSidebar">
        <nav>
            <ul>
                <li><button v-on:click="this.$router.push('/Admin')">Home   </button><i class="fa fa-home" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/AddProduct')">Add Products   </button><i class="fa fa-home" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/AdminProduct')">Products   </button><i class="fa fa-product-hunt" aria-hidden="true"></i></li>
                <li><button v-on:click="confirmUser()">LogOut   </button><i class="fa fa-sign-out" aria-hidden="true"></i></li>
            </ul>
        </nav>
    </div>
    <div id="menubtn" v-on:click="openNavBar">
        <img src="../assets/images/menu.png" id="menu">
    </div>
    <div id="menubtn" v-if="showSidebar" v-on:click="closeNavBar">
        <img src="../assets/images/close.png" id="menu">
    </div>
</template>

<script>
    export default{
        name:'Side-bar2',
        methods:{
            openNavBar(){
                this.showSidebar = true
            },
            closeNavBar(){
                this.showSidebar = false
            },
            confirmUser() {
                if(confirm("Are you sure ? want to leave the page ?")){
                    this.$router.push('/');
                }else{
                    this.$router.push('/Admin');
                }
            }
        },
        data(){
            return{
                showSidebar:false,
            }
        }
    }
</script>

<style>
    #sidebar {
        padding-top: 60px;
        width: 200px;
        height: 100vh;
        position: fixed;
        right: 0px;
        top: 0;
        background: #009688;
        z-index: 2;
        transition: 0.5s;
    }
    #sidebar i {
        color: white;
        margin-left: 7px;
    }
    nav ul li {
        list-style: none;
        margin: 50px 20px;
    }
    nav ul li button {
        background: none!important;
        border: none;
        padding: 0!important;
        text-decoration: none;
        color: white;
        font-size: 18px;
        padding: 8px;
        cursor: pointer;
    }
    #menubtn {
        width: 50px;
        height: 50px;
        background-color: #009688;
        text-align: center;
        position: fixed;
        right: 30px;
        top: 20px;
        z-index: 3;
        cursor: pointer;
        border-radius: 3px;
    }
    #menubtn img {
        width: 20px;
        margin: 15px;
    }
</style>


<!-- <template> 
    <div id="sidebar" v-if="showSidebar">
        <nav>
            <ul>
                <li><button v-on:click="this.$router.push('/Home')">Home   </button><i class="fa fa-home" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/Carts')">Carts   </button><i class="fa fa-shopping-cart" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/Testimonials')">Testimonials   </button><i class="fa fa-plus-circle" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/Products')">Products   </button><i class="fa fa-product-hunt" aria-hidden="true"></i></li>
                <li><button v-on:click="this.$router.push('/Contacts')">Contact   </button><i class="fa fa-phone-square" aria-hidden="true"></i></li>
                <li><button v-on:click="confirmUser()">LogOut   </button><i class="fa fa-sign-out" aria-hidden="true"></i></li>
            </ul>
        </nav>
    </div>
    <div id="menubtn" v-on:click="openNavBar">
        <img src="../assets/images/menu.png" id="menu">
    </div>
    <div id="menubtn" v-if="showSidebar" v-on:click="closeNavBar">
        <img src="../assets/images/close.png" id="menu">
    </div>
</template>

<script>
    export default{
        name:'Side-bar',
        methods:{
            openNavBar(){
                this.showSidebar = true
            },
            closeNavBar(){
                this.showSidebar = false
            },
            confirmUser() {
                if(confirm("Are you sure ? want to leave the page ?")){
                    this.$router.push('/');
                }else{
                    this.$router.push('/Home');
                }
            }
        },
        data(){
            return{
                showSidebar:false,
            }
        }
    }
</script>

<style>
    #sidebar {
        padding-top: 60px;
        width: 200px;
        height: 100vh;
        position: fixed;
        right: 0px;
        top: 0;
        background: #009688;
        z-index: 2;
        transition: 0.5s;
    }
    #sidebar i {
        color: white;
        margin-left: 7px;
    }
    nav ul li {
        list-style: none;
        margin: 50px 20px;
    }
    nav ul li button {
        background: none!important;
        border: none;
        padding: 0!important;
        text-decoration: none;
        color: white;
        font-size: 18px;
        padding: 8px;
        cursor: pointer;
    }
    #menubtn {
        width: 50px;
        height: 50px;
        background-color: #009688;
        text-align: center;
        position: fixed;
        right: 30px;
        top: 20px;
        z-index: 3;
        cursor: pointer;
        border-radius: 3px;
    }
    #menubtn img {
        width: 20px;
        margin: 15px;
    }
</style> -->