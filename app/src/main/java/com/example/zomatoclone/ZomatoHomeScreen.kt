package com.example.zomatoclone
import android.os.Bundle
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.serialization.decodeFromString
import kotlinx.serialization.json.Json


class ZomatoHomeScreen : AppCompatActivity() {
    lateinit var toolbar:Toolbar
    lateinit var recycler: RecyclerView
//    lateinit var foodList:ArrayList<FoodData>
//    lateinit var imagelist:ArrayList<FoodData>
    lateinit var myDataList:Sample
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_zomato_home_screen)
//        init()
        toolbar=findViewById(R.id.toolbar)
        // strep 1
        setSupportActionBar(toolbar)
        //step 2
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeAsUpIndicator(R.drawable.baseline_location_on_24)
        toolbar.setTitle("Home")
        toolbar.setSubtitle("friends market opposite kharar bus..")

        val jsonString=assets.open("data.json").bufferedReader().use { it.readText() }
        myDataList=  Json.decodeFromString<Sample>(jsonString)

        // First Adapter
        val recyclerView: RecyclerView = findViewById(R.id.recycler)
        // Create a GridLayoutManager with horizontal orientation
        val layoutManager = GridLayoutManager(this, 2 , GridLayoutManager.HORIZONTAL, false)
        // Set the layout manager for the RecyclerView
        recyclerView.layoutManager = layoutManager
        // Create and set the adapter for the RecyclerView
        val adapter = FoodImageAdapter(myDataList.sample, this)
        recyclerView.adapter = adapter

        // second Adapter

        val Adapter=FoodImageRectangleAdapter(myDataList.sample,this)
        val recycler2:RecyclerView=findViewById(R.id.recycler2)
        val linearlayout=LinearLayoutManager(this)
        linearlayout.orientation=LinearLayoutManager.VERTICAL
        recycler2.layoutManager=linearlayout

        recycler2.adapter=Adapter

    }
    // method to inflate the menu list in app bar
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.appbar_icons, menu)
        return true
    }
//    private fun init()
//    {
//
//       foodList= arrayListOf()
//
//          foodList.add(FoodData(R.drawable.pizza, "Pizza"))
//           foodList.add(FoodData(R.drawable.muttonbiriyani, "muttonbiriyani "))
//          foodList.add(FoodData(R.drawable.burger, "burger"))
//        foodList.add(FoodData(R.drawable.thali, "thali"))
//        foodList.add(FoodData(R.drawable.pizza, "pizza"))
//        foodList.add(FoodData(R.drawable.muttonbiriyani, "muttonbiriyani "))
//        foodList.add(FoodData(R.drawable.burger, "burger"))
//        foodList.add(FoodData(R.drawable.thali, "thali"))
//        foodList.add(FoodData(R.drawable.pizza, "pizza"))
//        foodList.add(FoodData(R.drawable.muttonbiriyani, "muttonbiriyani "))
//        foodList.add(FoodData(R.drawable.burger, "burger"))
//        foodList.add(FoodData(R.drawable.thali, "thali"))
//
//
//
//        imagelist= arrayListOf()
//        imagelist.add(FoodData(R.drawable.muttonbiriyani, "muttonbiriyani"))
//        imagelist.add(FoodData(R.drawable.pizza, "pizza "))
//        imagelist.add(FoodData(R.drawable.thali, "thali"))
//        imagelist.add(FoodData(R.drawable.burger, "burger"))
//
//
//
//    }




}
