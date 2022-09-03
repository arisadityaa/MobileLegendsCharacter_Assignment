package id.arisaditya.mobilelegendscharacter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListCharacterAdapter(private val listCharacter: ArrayList<Character>): RecyclerView.Adapter<ListCharacterAdapter.ListViewHolder>() {

    class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgChar: ImageView = itemView.findViewById(R.id.imgChar)
        var tvName:TextView = itemView.findViewById(R.id.nameChar)
        var tvRole:TextView = itemView.findViewById(R.id.roleChar)
        var tvSpecial:TextView = itemView.findViewById(R.id.specialityChar)
        var btnDetail: Button = itemView.findViewById(R.id.btnRead)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.list_character, parent, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val char = listCharacter[position]

        Glide.with(holder.itemView.context)
            .load(char.photo)
            .apply(RequestOptions().override(60, 60))
            .into(holder.imgChar)

        holder.tvName.text = char.name
        holder.tvRole.text = char.role
        holder.tvSpecial.text = char.speciality
        holder.btnDetail.setOnClickListener {
            val intent = Intent(it.context, DetailCharacter::class.java)
            intent.putExtra(DetailCharacter.CHAR_NAME, char.name)
            intent.putExtra(DetailCharacter.CHAR_ROLE, char.role)
            intent.putExtra(DetailCharacter.CHAR_SPECIALITY, char.speciality)
            intent.putExtra(DetailCharacter.CHAR_DESCRIPTION, char.description)
            intent.putExtra(DetailCharacter.CHAR_PHOTO, char.photo)
            intent.putExtra(DetailCharacter.CHAR_LINK, char.link)
            it.context.startActivity(intent)

        }
    }

    override fun getItemCount(): Int {
        return listCharacter.size
    }

}