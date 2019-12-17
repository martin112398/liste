package fr.purplegiraffe.projet_liste

import android.app.Application
import io.realm.Realm

class Myapp : Application()
{
    override fun onCreate()
    {
        super.onCreate()
        Realm.init(this)
    }
}