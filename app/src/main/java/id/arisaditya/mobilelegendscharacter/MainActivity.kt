package id.arisaditya.mobilelegendscharacter

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvCharacter:RecyclerView
    private var list: ArrayList<Character> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.title="Mobile Legends Wiki"

        rvCharacter = findViewById(R.id.recycle)
        rvCharacter.setHasFixedSize(true)

        list.addAll(CharacterData.ListData)
        showRecycleList()

    }

    private fun showRecycleList(){
        rvCharacter.layoutManager = LinearLayoutManager(this)
        val listCharacterAdapter = ListCharacterAdapter(list)
        rvCharacter.adapter = listCharacterAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int){
        when(selectedMode){
            R.id.listCharacter -> {

            }
            R.id.about ->{
                startActivity(Intent(this@MainActivity, About::class.java ))
            }
        }

    }
}