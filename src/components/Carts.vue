<template>
    <Sidebar />
    <section id="carts">
        <div class="title-text">
            <p>Carts</p>
            <h1>Your Collections</h1>
        </div>
        <div class="cart-table-div">
            <table id="cart-table" border="1">
                <tr id="cart-tr">
                    <th colspan="2">ProductName</th><th>Quantity</th><th>Price</th><th>Remove</th>
                </tr>
                <tbody>
                    <tr v-for="data in this.cartDetails" :key="data">
                        <td style="padding: 0px;margin:0px;background-color: white;"><img :src="require(`@/assets/products/p${data.pno}.jpg`)" alt class="icon" /></td>
                        <td> {{ data.name }} </td>
                        <td> {{ data.inCart }} </td>
                        <td> {{ data.price }} </td>
                        <td style="background-color: white;color:red;cursor: pointer;"><i class="fa fa-trash fa-2x" aria-hidden="true"></i></td>
                    </tr>
                    <tr>
                        <td colspan="5">Total = ${{ this.total }}</td>
                    </tr>
                </tbody>
            </table>
        </div>
    </section>
    <Footer />
</template>

<script>
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
                total:''
            }
        },
        mounted(){
            this.displayCart();
        },
        methods : {
            displayCart(){
                this.cartDetails = localStorage.getItem('productsInCart');
                this.cartDetails = JSON.parse(this.cartDetails);
                this.cartDetails = Object.values(this.cartDetails);
                this.total = localStorage.getItem('totalCost');
            },
            removeItem(){
            }
        }
    }
</script>

<style>
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
    }
    #carts {
        width: 100%;
        padding: 70px;
        margin-bottom: 55px;
    }
    .cart-table-div {
        margin-left: auto;
        margin-right: auto;
    }
    #cart-table {
        border: 7px solid #019587;
        margin-left: auto;
        margin-right: auto;
        border-radius: 4px;
        box-shadow: 5px 5px 10px #019587;
    }
    #img-td {
        margin: 0;
        padding: 0;
    }
    #cart-table tr td {
        font-family:monospace;
        font-size: 15px;
        color: white;
        background-color: gray;
        border: 3px solid #019587;
        padding: 10px 30px;
    }
    #cart-table tr td img {
        width: 120px;
        height: 50px;
    }
    #cart-table th {
        color: #019587;
        font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        font-size:x-large;
        padding: 12px;
        background-color: white;
    }
</style>