import java.util.*

enum class EntityType{
    EASY,NORMAL,HARD, HELP
}

object EntityFactory {
    fun create(type:EntityType) : Entity {

        val id = UUID.randomUUID().toString()
        val name = when(type) {
            EntityType.EASY -> type.name
            EntityType.HARD -> type.name
            EntityType.NORMAL -> type.name
            EntityType.HELP -> type.name
        }
        return when(type){
            EntityType.EASY -> Entity.Easy(id,name)
            EntityType.HARD -> Entity.Hard(id, name,2f)
            EntityType.NORMAL -> Entity.Medium(id,name)
            EntityType.HELP -> Entity.Help

        }
    }

}


sealed class Entity(){
    object Help:Entity() {
        val name = "Help"
    }
    data class Easy(val id:String, val name:String):Entity()
    data class Medium(val id:String, val name:String):Entity()
    data class Hard(val id:String, val name:String, val multiplier:Float):Entity()


}

/*
class Entity(val id:String, val name:String ){
    override fun toString(): String {
        return "id:$id name:$name"
    }

}*/


fun main(){

    val entity:Entity = EntityFactory.create(EntityType.EASY)
    val msg = when(entity){
        Entity.Help -> "Help Class"
        is Entity.Easy -> "Easy class"
        is Entity.Medium -> "Medium class"
        is Entity.Hard -> "Hard class"
    }

    println(msg)



}