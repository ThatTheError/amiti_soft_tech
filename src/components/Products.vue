<template>
    <Sidebar />
    <div class="title-text">
                <p>PRODUCTS</p>
                <h1>Shop Our Best Products</h1>
    </div>
    <section id="product">        
            <div class="container">
                <div class="image" v-for="product in productss" :key="product.pNo" >
                    <img :src="require(`@/assets/products/${product.pImg}`)" alt class="icon" />
                    <h3>{{product.pName}}</h3>
                    <h3>₹ {{product.pPrice}}</h3>
                    <i class="add-cart" @click="addToCart(product)">Add Cart</i>
                </div>
            </div>
        </section>
        <Footer />
</template>

<script>
    import axios from 'axios'
    import Sidebar from './Sidebar.vue'
    import Footer from './Footer.vue'
    export default {
        name :'Products-comp',
        components: {
            Sidebar,
            Footer
        },
        data() {
            return {
                pro:'',
                productss:''
            }
        },
        created(){
            this.scheduleProducts();
        },
        methods: {
            async scheduleProducts()
            {
                var pro = await axios.get("http://localhost:8282/getallproducts");
                this.productss = pro.data;
            },
            async addToCart(product) 
            {
                console.log(product)
                var uEmail = JSON.parse(localStorage.getItem("CurrentUser"));
                uEmail = uEmail.uEmail;
                console.log(uEmail);
                var pId = product.pNo;
                var data = {
                    "uId" : "",
                    "pId" : ""+pId,
                    "pQty" : ""+1
                }
                this.pro = await axios.post("http://localhost:8282/spproducts?uEmail="+uEmail+"",data);
            }
            //     let productNumbers = localStorage.getItem("cartNumbers");
            //     productNumbers = parseInt(productNumbers);
            //     if(productNumbers){
            //         localStorage.setItem('cartNumbers',productNumbers+1);
            //     }else{
            //         localStorage.setItem("cartNumbers" , 1);
            //     }
            //     this.setItems(product);
            //     this.totalCost(product);
            // },
            // setItems(product){
            //     let cartItems = localStorage.getItem('productsInCart');
            //     cartItems = JSON.parse(cartItems);
            //     if(cartItems != null){
            //         if(cartItems[product.tag] == undefined) {
            //             cartItems = {
            //                 ...cartItems,
            //                 [product.tag] : product
            //             }
            //         }
            //         cartItems[product.tag].inCart += 1;
            //     }else {
            //         product.inCart = 1;
            //         cartItems = {
            //             [product.tag] : product
            //         }
            //     }
            //     localStorage.setItem("productsInCart", JSON.stringify(cartItems));
            //     //this.saveToDatabase(cartItems)
            // },
            // totalCost(product) {
            //     let cartCost = localStorage.getItem('totalCost');
            //     cartCost =  parseInt(cartCost);
            //     if(!cartCost) {
            //         cartCost = product.price;
            //     }
            //     else{
            //         cartCost += product.price;
            //     }
            //     localStorage.setItem('totalCost',cartCost);
            // },
            // saveToDatabase(product){
            //     var pro = {
            //         "Product_Number" : ""+product.pno,
            //         "Product_Name" : ""+product.name,
            //         "Product_Quantity" : ""+product.inCart,
            //         "Product_Price" : ""+product.price
            //     }
            // }
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
        color: #009688;
    }
    #product {
        width: 100%;
        padding: 70px 0;
        background: #efefef;
    }
    .container {
        display: flex;
        justify-content: center;
        flex-wrap: wrap;
        margin-top: 50px;
        padding-bottom: 100px;
    }
    .image {
        width: 300px;
        height: 340px;
        margin: 60px 100px;
        position: relative;
        overflow: hidden;
        border: solid 0.2px #009688;
        background: linear-gradient(rgba(0,0,0,0.5),#009688);
        border-radius: 9px;
    }
    .image img {
        margin: auto;
        width: 100%;
        height: 65%;
        background-color: #009688;
    }
    .image i{
        height: 25px;
        font-family: cursive;
        background-color: #fff;
        color: #019587;
        text-decoration: none;
        text-align: center;
        font-weight: bolder;
        margin: 11px 80px;
        padding: 4px 31px;
        display: inline-block;
        border: 3px solid white;
        border-radius: 8px;
        cursor: pointer;
    }
    .add-cart:hover {
        background-color: whitesmoke;
        color: #009688;
    }
    .image h3 {
        margin-left: 9px;
        margin-top: 6px;
        font-family: Arial, Helvetica, sans-serif;
        color: #efefef;
    }
</style>