package com.caramel.slingshot.adapters

import android.view.View
import com.caramel.slingshot.model.Player

class PlayerAdapter(
    dataList: List<Player>,
    layoutId: Int,
    bind: (view: View, item: Player) -> Unit
) : BaseAdapter<Player>(dataList, layoutId, bind) {

    // Example of adding custom functionality: Sorting by player name
    fun sortByName() {
        val sortedList = dataList.sortedBy { it.name }
        updateData(sortedList)
    }

    // You can also override methods from BaseAdapter if needed
    override fun onBindViewHolder(holder: BaseViewHolder<Player>, position: Int) {
        super.onBindViewHolder(holder, position)
        // You can add any additional behavior here (e.g., extra view modifications)
    }

//    Example usage of adapter
//        recyclerView = findViewById(R.id.recyclerView)
//
//        // Sample data
//        val players = listOf(
//            Player(1, "John", "https://icon.url/john"),
//            Player(2, "Alice", "https://icon.url/alice"),
//            Player(3, "Bob", "https://icon.url/bob")
//        )
//
//        // Initialize the custom adapter
//        adapter = PlayerAdapter(
//            dataList = players,
//            layoutId = R.layout.item_player, // layout for each player
//            bind = { view, player ->
//                val binding = ItemPlayerBinding.bind(view)
//                binding.name.text = player.name
//                binding.icon.load(player.icon) // Glide or ImageLoader for images
//                view.setOnClickListener {
//                    Toast.makeText(this, "Clicked on ${player.name}", Toast.LENGTH_SHORT).show()
//                }
//            }
//        )
//
//        // Set up RecyclerView
//        recyclerView.layoutManager = LinearLayoutManager(this)
//        recyclerView.adapter = adapter
//
//        // Sorting the list by name
//        adapter.sortByName()  // Custom function for sorting
}
