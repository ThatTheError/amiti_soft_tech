import {createWebHistory,createRouter} from 'vue-router';
import Home from "./components/Home"
import SignIn from "./components/SignIn"
import SignUp from "./components/SignUp"
import Products from "./components/Products"
import Contact from "./components/Contact"
import Services from "./components/Services"

const routes = [
    {
        name:'SignIn',
        path:'/',
        component:SignIn
    },
    {
        name:'Home',
        path:'/Home',
        component:Home
    },
    {
        name:'SignUp',
        path:'/SignUp',
        component:SignUp
    },
    {
        name:'Products',
        path:'/Products',
        component:Products
    },
    {
        name:'Contacts',
        path:'/Contacts',
        component:Contact
    },
    {
        name:'Services',
        path:'/Services',
        component:Services
    }
];

const router = createRouter({
    history:createWebHistory(),
    routes
});
export default router;