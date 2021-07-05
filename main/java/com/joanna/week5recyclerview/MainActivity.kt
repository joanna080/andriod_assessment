package com.joanna.week5recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.joanna.week5recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var myContactAdapter: ContactAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val profiles: List<ContactModel> = listOf(
            ContactModel(R.drawable.ic_w1, "Favour", "Ndokwa"),
            ContactModel(R.drawable.ic_w2, "Tega", "Philip"),
            ContactModel(R.drawable.ic_w3, "Yole", "Imido"),
            ContactModel(R.drawable.ic_w4, "Efe", "Ashogba"),
            ContactModel(R.drawable.ic_w5, "Godswill", "Onomor" ),
            ContactModel(R.drawable.ic_w6, "Janet", "Aboyowa"),
            ContactModel(R.drawable.ic_w7, "Christian", "Akpeto"),
            ContactModel(R.drawable.ic_w8, "Mamus", "Vincent"),
            ContactModel(R.drawable.ic_w9, "Iyabo", "Mukaila"),
            ContactModel(R.drawable.ic_w10, "Efeturi", "Efemena"),
            ContactModel(R.drawable.ic_w1, "Faith", "Edoja"),
            ContactModel(R.drawable.ic_w2, "Clifford", "Alex"),
            ContactModel(R.drawable.ic_w3, "Josephine", "Zubairu"),
            ContactModel(R.drawable.ic_w4, "Kingsley", "Nzekwe"),
            ContactModel(R.drawable.ic_w5, "Treasure", "Ekwireme"),
            ContactModel(R.drawable.ic_w6, "Iris", "Azanubi"),
            ContactModel(R.drawable.ic_w7, "Ochuko", "Imonisa"),
            ContactModel(R.drawable.ic_w8, "Samuel", "Oyibo"),
            ContactModel(R.drawable.ic_w9, "James", "Umukoro"),
            ContactModel(R.drawable.ic_w10, "Felix", "Nworisa")





        )
        myContactAdapter = ContactAdapter(profiles)
        binding.recyclerView.adapter = myContactAdapter
    }
}