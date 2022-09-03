package id.arisaditya.mobilelegendscharacter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import android.widget.ImageButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class About : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnIG: ImageButton
    private lateinit var btnLinkedin: ImageButton
    private lateinit var btnGithhub: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
        supportActionBar?.title="About Me"

        btnIG = findViewById(R.id.instagram)
        btnGithhub = findViewById(R.id.github)
        btnLinkedin = findViewById(R.id.linkedin)

        btnIG.setOnClickListener(this)
        btnGithhub.setOnClickListener(this)
        btnLinkedin.setOnClickListener(this)


    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onContextItemSelected(item)
    }

    private fun setMode(seletedMode: Int){
        when(seletedMode){
            R.id.listCharacter -> {
                startActivity(Intent(this@About, MainActivity::class.java ))
            }
            R.id.about ->{

            }
        }

    }

    override fun onClick(p0: View?) {
        val linkAbout: String
        when(p0?.id){
            R.id.instagram ->{
                linkAbout= "https://www.instagram.com/arisaditya_/"
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkAbout) ))
                Toast.makeText(this,"Going To Instagram", Toast.LENGTH_SHORT).show()

            }
            R.id.github ->{
                linkAbout= "https://github.com/arisadityaa"
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkAbout) ))
                Toast.makeText(this,"Going To Github", Toast.LENGTH_SHORT).show()
            }
            R.id.linkedin ->{
                linkAbout= "https://www.linkedin.com/in/aris-aditya-nugraha-1395b8228/"
                startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(linkAbout) ))
                Toast.makeText(this,"Going To LinkedIn", Toast.LENGTH_SHORT).show()

            }
        }
    }
}