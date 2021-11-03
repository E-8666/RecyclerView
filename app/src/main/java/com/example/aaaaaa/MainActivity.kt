package com.example.aaaaaa
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
class MainActivity : AppCompatActivity() {
    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val superheroList = listOf<superhero>(
            superhero(
                R.drawable.antman, namesuperhero = "Ant man", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.blackpant, namesuperhero = "Black panther", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.blackwidow, namesuperhero = "Black widow", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.captain, namesuperhero = "Captain america", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.captmarvel, namesuperhero = "Captain marvel", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.doctor, namesuperhero = "Doctor strange", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.gamora, namesuperhero = "Gamora", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.hawkeye, namesuperhero = "Hawkeye", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.hulk, namesuperhero = "Hulk", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.ironman, namesuperhero = "Iron man", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.loki, namesuperhero = "Loki", descsuperhero = "aaaaa."
            ),
            superhero(
                R.drawable.nebula, namesuperhero = "Nebula", descsuperhero = "aaaaa."
            ),
        )
        val recyclerView = findViewById<RecyclerView>(R.id.hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = superheroadapter(this, superheroList){
            val intent = Intent(this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}
