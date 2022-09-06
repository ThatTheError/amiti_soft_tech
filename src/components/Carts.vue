<template>
    <Sidebar />
    <div class="title-text">
            <p>Carts</p>
            <h1>Your Collections</h1>
    </div>
    <div class="admintable">
        <table class="styled-table">
            <thead>
                <tr>
                    <th></th><th>ProductName</th><th>Quantity</th><th>Price</th><th>Remove</th>
                </tr>
            </thead>
            <tbody>
                <tr v-for="cartItem in cartDetails" :key="cartItem.pNo">
                    <td><img :src="require(`@/assets/products/${cartItem[3]}`)" alt class="icon" style="width: 100px ;height: 100px;" /></td>
                    <td> {{ cartItem[1] }} </td>
                    <td> {{ cartItem[4] }} </td>
                    <td> <i class="fa fa-rupee"></i>{{ cartItem[2] }} </td>
                    <td style="color:red;cursor: pointer;"><i class="fa fa-trash fa-2x" aria-hidden="true" @click="removeItem(cartItem)"></i></td>
                </tr>
                <tr> 
                    <td colspan="5">Total  <i class="fa fa-rupee"></i>{{ this.total }}</td>
                </tr>
                <tr class="lr">
                    <button @click="buyNow()" >Buy Now</button>
                </tr>
            </tbody>
        </table>
    </div>
    <Footer />
</template>

<script>
    import axios from 'axios'
    import Footer from "./Footer.vue"
    import Sidebar from "./Sidebar.vue"
    export default {
        name: 'Carts-comp',
        components : {
            Sidebar,
            Footer
        },
        data() {
            return{
                cartDetails:'',
                total:'',
            }
        },
        created(){
            this.displayCart();
        },
        methods : {
            async displayCart(){
                var uEmail = JSON.parse(localStorage.getItem("CurrentUser"));
                uEmail = uEmail.uEmail;
                var cart = await axios.get("http://localhost:8282/gproducts?uEmail="+uEmail);
                this.total = await axios.get("http://localhost:8282/gtotal?uEmail="+uEmail);
                this.total = this.total.data;
                this.cartDetails = cart.data;
                console.log(this.cartDetails);
                console.log(this.total);
            },
            async removeItem(cartItem){
                var pId = cartItem[0];
                var uEmail = JSON.parse(localStorage.getItem("CurrentUser"));
                uEmail = uEmail.uEmail;
                console.log(uEmail,pId);
                await axios.post("http://localhost:8282/dpproducts?uEmail="+uEmail+"&pId="+pId);
                this.total = await axios.get("http://localhost:8282/gtotal?uEmail="+uEmail);
                this.total = this.total.data;
                this.displayCart();
            },
            buyNow(){
                this.$router.push('/Payment');
            }
        }
    }
</script>

<style>
    tbody .lr {
        background-color: #009688;
        height: 54px;
        width: 100%;
    }
    .lr button{
        cursor: pointer;
        width: 700.5%;
        height: 54px;
        background-color: #009688;
        margin: auto;
        position: relative;
        text-decoration: none;
        border: none;
        font-size: 20px;
        font-weight: bold;
        color: whitesmoke;
    }
    .lr button:hover {
        background-color: whitesmoke;
        transition:cubic-bezier(0.075, 0.82, 0.165, 1);
        color: #009688;
    }
</style>