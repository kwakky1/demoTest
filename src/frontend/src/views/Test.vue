<template>
    <div clss="test">
        <h1>This is an Test Page</h1>
        <button v-on:click="reversMsg">ReversMsg</button>
        <p>{{message}}</p>
        <b>count : {{this.$store.state.count}}</b><br>
        <b>count^2 : {{this.$store.getters.count}}</b><br>
        <b>weight : {{this.$store.getters.weight}}</b><br>
        <b>random : {{this.$store.getters.random}}</b><br>
        <input type="button" @click="increment()" value="Increment">
        <input type="button" @click="decrement()" value="Decrement">
        <input type="button" @click="random()" value="Random">
    </div>
</template>

<script>
export default {
    data() {
        return {
            cnt :0,
            count: 7,
            message : '안녕 난 뷰야~'
        }
    },
    methods : {
      reversMsg: function () {
        this.message = this.message.split('').reverse().join()
          // $가 붙으며  Vue 내장 함수를 사용하겠다는 의미가 된다.
          // 객체가 파괴되면 우리가 어떤한 요청을 넣어도 응답하지 않게 된다.
        this.$destroy()
      },
      increment : function () {
        this.$store.commit('increment')
      },
      decrement : function () {
        this.$store.commit('decrement')
      },
      random : function () {
        this.$store.dispatch('generateRandomNumber')
    }
    },
    beforeCreate() {
        //alert("Before Create: " + this.count)
    },
    created() {
        //alert("Create: " + this.count)
    },
    beforeMount() {
        //alert("Before Mount: " + this.count)
    },
    mounted() {
        //alert("Mount: " + this.count)
    },
    beforeUpdate() {
        //alert('Before Update: ' + this.message)
    },
    updated() {
        //alert('Update: ' + this.message)
    },
    beforeDestroy() {
        //alert('Before Destroy: ' + this.message)
    },
    destroyed() {
        //alert('Destroy: ' + this.message)
        // 객체 파괴를 감지하고 다시 서비스를 재개할 수 있도록 준비해줘야한다.
    }
}
</script>

<style scoped>

</style>