package fr.purplegiraffe.liste

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AbsListView
import androidx.recyclerview.widget.RecyclerView
import fr.purplegiraffe.projet_liste.R
import io.realm.Realm
import io.realm.RealmResults
import kotlinx.android.synthetic.main.cell_series.view.*

class SeriesAdapter : RecyclerView.Adapter <SeriesAdapter.CharactereViewHolder>()
{
    val _SeriesList:RealmResults<Series>
init
{
    val realm = Realm.getDefaultInstance()
    _SeriesList = realm.where(Series::class.java).sort("show").findAll()
//   if (_SeriesList.size == 0)
//   {
//       val initialSeriesList = arrayOf(Series("Vikings","histoire"),
//           Series("Black sails","histoire"),
//           Series("The Musketeers", "histoire"),
//           Series("the big bang theory", "sitcom"),
//           Series("how i met your mother", "sitcom"),
//           Series("brooklyn nine-nine", "sitcom"),
//           Series("hawaii 5-0", "Police"),
//           Series("Scream", "Horror"))
//           realm.beginTransaction()
//           for (Series in initialSeriesList)
//           {
//               realm.copyToRealm(Series)
//           }
//           realm.commitTransaction()
//
//
//   }
}




    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CharactereViewHolder {
        val rootView = LayoutInflater.from(parent.context).inflate(R.layout.cell_series,parent, false)
        val holder = CharactereViewHolder(rootView)

        return holder

    }

    override fun getItemCount(): Int {
        return _SeriesList.size
    }

    override fun onBindViewHolder(holder: CharactereViewHolder, position: Int)
    {
        var Series= _SeriesList[position]
        if (Series != null)
        {
            holder.fillWithCharacter(Series)
        }

    }

    class CharactereViewHolder(rootView: View) : RecyclerView.ViewHolder(rootView)
    {
        private val ui_title = rootView.ui_title
        private val ui_subtitle = rootView.ui_subtitle


        fun fillWithCharacter(series: Series)
        {
            ui_title.text = series.name
            ui_subtitle.text = series.show
        }
    }

}