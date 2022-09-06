<template>

        {{ upperCase(t) }}
        <label>Gopal</label>

        <pra pra="gopal" />
    
</template>

<script>

export default{
    name:"practice-comp",
    data(){
        return{
            t : "Gopal"
        }
    },
    filters : {
        upperCase : function(str){
            return str.toUpperCase();
        }
    }
}

</script>

<style>

</style>