package id.arisaditya.mobilelegendscharacter

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DetailCharacter : AppCompatActivity(), View.OnClickListener {

    companion object{
        const val CHAR_NAME="character_name"
        const val CHAR_ROLE="character_role"
        const val CHAR_SPECIALITY="character_speciality"
        const val CHAR_DESCRIPTION="character_description"
        const val CHAR_PHOTO="character_image"
        const val CHAR_LINK="character_link"

    }

    private lateinit var tvName:TextView
    private lateinit var tvRole:TextView
    private lateinit var tvSpeciality:TextView
    private lateinit var tvDescription:TextView
    private lateinit var imgChar:ImageView
    private lateinit var btnGuide:Button
    private lateinit var link:String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_character)

        tvName = findViewById(R.id.nameChar)
        tvRole = findViewById(R.id.roleChar)
        tvSpeciality = findViewById(R.id.specialityChar)
        tvDescription = findViewById(R.id.descriptionChar)
        imgChar = findViewById(R.id.imgChar)
        btnGuide = findViewById(R.id.btnGuide)


        val name =intent.getStringExtra(CHAR_NAME)
        val role ="Role : " +  intent.getStringExtra(CHAR_ROLE)
        val speciality ="Speciality : " + intent.getStringExtra(CHAR_SPECIALITY)
        val description = intent.getStringExtra(CHAR_DESCRIPTION)
        val image = intent.getIntExtra(CHAR_PHOTO, 0)
        link = intent.getStringExtra(CHAR_LINK).toString()


        tvName.text=name
        tvRole.text=role
        tvSpeciality.text=speciality
        tvDescription.text=description
        imgChar.setImageResource(image)

        btnGuide.setOnClickListener(this)

        supportActionBar?.title="Details $name Character"



    }

    override fun onClick(p0: View?) {
        val intentLink = Intent(Intent.ACTION_VIEW, Uri.parse(link))
        startActivity(intentLink)
    }


}