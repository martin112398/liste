package fr.purplegiraffe.projet_liste

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import fr.purplegiraffe.liste.Series
import fr.purplegiraffe.liste.SeriesAdapter
import io.realm.Realm
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.StringBuilder

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ui_serieslist.adapter = SeriesAdapter()
        ui_serieslist.layoutManager = LinearLayoutManager(this)




    }

}
