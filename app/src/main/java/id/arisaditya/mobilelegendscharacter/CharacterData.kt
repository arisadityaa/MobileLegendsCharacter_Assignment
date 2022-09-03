package id.arisaditya.mobilelegendscharacter

object CharacterData {
    private val charName = arrayOf(
        "Miya", "Balmond", "Saber", "Alice", "Nana", "Tigreal", "Alucard", "Karina", "Akai", "Franco"
    )

    private val charRole = arrayOf(
        "Marksman", "Fighter", "Assassin", "Mage/Tank", "Mage/Support", "Tank/Support", "Fighter/Assasin", "Assasin/Mage", "Tank", "Tank"
    )

    private val charSpeciality = arrayOf(
        "Reap/Damage", "Damage/Regen", "Charge/Reap", "Charge/Regen", "Poke/Guard", "Crowd Control", "Chase/Damage", "Reap/Magic Damage", "Guard/Crowd Control", "Initiator/Control"
    )

    private val charDetail = arrayOf(
        "Miya lived in Azrya with the other Moon Elves. She stood aloof from the worldly strife, and did not expect the Demon army would attack suddenly. In order to protect her homeland, Miya, as the Priestess of the Moon, led the other Moon Elves in a defense against foreign enemies.",
        "Balmond is the leader of the Orcs, leading the Orc army against the invasion of the Demons. During a battle, he consumed the blood of a Blood Demon and went into a rage. This aroused Alice's interest, so she signed a contract with Balmond on the condition of returning the Stormeye Wasteland. Balmond, and his Orc army have since fought for the Demons.",
        "Once called Duanmeng and obsessed by kendo, Saber came to Laboratory 1718 to transform himself in order to pursue true invincibility, but his memory was erased and he became a killing machine. The torture of his memories drove him to finally destroy the laboratory. And set off on our life on the run, searching for the past",
        "Alice was born in the era of strife long ago. As an illegitimate daughter, she suffered humiliation since she was a child, bewitched by the demons. Alice provoked disputes within the family, eventually taking control of the entire family and leading all of its members to betray the Lord of Light. But their betrayal triggered a divine punishment and turned him into blood demons. As a result, Alice led them to join the Abyss and they had fought for the darkness ever since.",
        "In order to have the means of controlling the magic in her body and stop causing trouble, Nana went to the Shadow Swamp in search of a magical fruit with her good friend Molina. But when danger came, Molina died protecting Nana. Although Nana got what she wanted, she also lost her friend. With the strength that Molina left her, Nana embarked on a new journey.",
        "Tigreal is the rising star of the Moniyan Empire. But in a battle, the Second Army that he was leading went deep into the enemy territory alone under the orders of high-level officials and suffered heavy losses, for which Tigreal was eventually forced to take responsibility. Because of this, he left the Empire and came to the Northern Vale. During this period of time, Tigreal finally resolved the problems in his mind. Eventually, he returned to the Empire and became the leader of the Light's Order.",
        "Alucard's father was a comrade-in-arms of Tigreal who disappeared in a battle with the Demons. Therefor, he hated darkness, joined the Monastery of Light, and swore to destory all Demons. But later he learned the hidden secrets of this battle, so he left the Monastery of Light in anger and fought the darkness in his own way.",
        "Karina Was trained to become a cold-hearted assassin from a very young age. As such she has no qualms in using all means necessary to achieve her goals, unfazed even if her target is a woman or a child.",
        "Once there was a panda in Stream Valley named Akai. With the dream of becoming a hero, he was always eager to offer help, but often ended up causing more trouble instead. He worked hard to pursue his dream, and although he'd once wandered off right the path. In the end, he recalled his original intention and become a true hero.",
        "Franco is the only warrior on the Frozen Ocean who can lead people in the fighter against Bane. In one battle, Franco saw through Bane's tricks and finally defeated him. Life was brought back to the Northern Vale under his leadership."
    )

    private val charImage = intArrayOf(
        R.drawable.miya,
        R.drawable.balmond,
        R.drawable.saber,
        R.drawable.alice,
        R.drawable.nana,
        R.drawable.tigreal,
        R.drawable.alucard,
        R.drawable.karina,
        R.drawable.akai,
        R.drawable.franco
    )

    private val charLink = arrayOf(
        "https://www.mobilelegends.com/en/herodetail/1",
        "https://www.mobilelegends.com/en/herodetail/2",
        "https://www.mobilelegends.com/en/herodetail/3",
        "https://www.mobilelegends.com/en/herodetail/4",
        "https://www.mobilelegends.com/en/herodetail/5",
        "https://www.mobilelegends.com/en/herodetail/6",
        "https://www.mobilelegends.com/en/herodetail/7",
        "https://www.mobilelegends.com/en/herodetail/8",
        "https://www.mobilelegends.com/en/herodetail/9",
        "https://www.mobilelegends.com/en/herodetail/10"
    )

    val ListData:ArrayList<Character>
    get(){
        val list = arrayListOf<Character>()
        for (position in charName.indices){
            val char = Character()
            char.name = charName[position]
            char.role = charRole[position]
            char.speciality = charSpeciality[position]
            char.description = charDetail[position]
            char.photo = charImage[position]
            char.link = charLink[position]
            list.add(char)
        }
        return list
    }


}