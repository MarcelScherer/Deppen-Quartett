package com.example.deppen_quartett

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.annotation.DrawableRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity(), View.OnClickListener {

    lateinit var kartenStapelComputer: kartenStapel
    lateinit var kartenStapelUser: kartenStapel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main) // Stelle sicher, dass dies dein korrektes Layout ist
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        kartenStapelComputer = kartenStapel(mutableListOf(), 0, 0)
        kartenStapelUser = kartenStapel(mutableListOf(), 0, 0)

        // Setze Click Listener für die relevanten TextViews
        findViewById<TextView>(R.id.funktion_2).setOnClickListener(this)
        findViewById<TextView>(R.id.chilligkeit_2).setOnClickListener(this)
        findViewById<TextView>(R.id.aussehen_2).setOnClickListener(this)
        findViewById<TextView>(R.id.beliebtheit_2).setOnClickListener(this)
        findViewById<TextView>(R.id.Peinlichkeit_2).setOnClickListener(this) // Achte auf Groß-/Kleinschreibung der ID
        findViewById<TextView>(R.id.gefarlichkeit_2).setOnClickListener(this)
        findViewById<TextView>(R.id.nerfigkeit_2).setOnClickListener(this)
        findViewById<TextView>(R.id.bayern_2).setOnClickListener(this)
        findViewById<TextView>(R.id.Deppenfaktor_2).setOnClickListener(this) // Achte auf Groß-/Kleinschreibung
        findViewById<TextView>(R.id.heldenstatus_2).setOnClickListener(this)
        findViewById<TextView>(R.id.startNewGame).setOnClickListener(this)

        start_new_game()
    }

    private fun start_new_game(){
        teileKartenAuf()
        kartenStapelComputer.aktuelleKatennummer = 0;
        kartenStapelUser.aktuelleKatennummer = 0;
        kartenStapelUser.anzahlKarten = kartenStapelUser.KartenListe.size
        kartenStapelComputer.anzahlKarten = kartenStapelComputer.KartenListe.size
        updateLayout(kartenStapelUser.KartenListe.get(kartenStapelUser.aktuelleKatennummer))
        val funktionTextView = findViewById<TextView>(R.id.ergebnis)
        funktionTextView.text = "Deine Karten: " + kartenStapelUser.KartenListe.size.toString() + " Computer Karten:" + kartenStapelComputer.KartenListe.size.toString()
    }

    override fun onClick(view: View?) {
        Log.d("Deppe-Quartett", "Taste gedrück")
        if(view?.id == R.id.startNewGame)
        {
            start_new_game()
        }
        if(kartenStapelUser.KartenListe.size > 0 && kartenStapelComputer.KartenListe.size > 0) {
            when (view?.id) {
                R.id.chilligkeit_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).chilligkeit,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).chilligkeit
                )

                R.id.aussehen_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).aussehen,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).aussehen
                )

                R.id.beliebtheit_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).beliebtheit,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).beliebtheit
                )

                R.id.Peinlichkeit_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).peinlichkeit,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).peinlichkeit
                )

                R.id.gefarlichkeit_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).gefaerlichkeit,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).gefaerlichkeit
                )

                R.id.nerfigkeit_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).nerfigkeit,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).nerfigkeit
                )

                R.id.bayern_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).bayern_gen,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).bayern_gen
                )

                R.id.Deppenfaktor_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).deppenfaktor,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).deppenfaktor
                )

                R.id.heldenstatus_2 -> vergleicheKartenWert(
                kartenStapelUser.KartenListe.get(
                    kartenStapelUser.aktuelleKatennummer
                ).heldnestatus,
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).heldnestatus
                )
            }
        }
        if(kartenStapelUser.aktuelleKatennummer >= 0 && kartenStapelComputer.aktuelleKatennummer >= 0) {
            updateLayout(kartenStapelUser.KartenListe.get(kartenStapelUser.aktuelleKatennummer))
        }
    }

    private fun vergleicheKartenWert(kartenWertUser: UInt, kartenWertComputer: UInt){
        if(kartenStapelUser.KartenListe.size > 0 && kartenStapelComputer.KartenListe.size > 0) {
            var kartennamen: String =
                kartenStapelComputer.KartenListe.get(kartenStapelComputer.aktuelleKatennummer).funktion
            if (kartenStapelUser.aktuelleKatennummer >= 0 && kartenStapelComputer.aktuelleKatennummer >= 0) {
                if (kartenWertUser > kartenWertComputer) {
                    Log.d("Deppe-Quartett", "du hast gewonnen")
                    // Verschiebe die Karte vom Computer zum User
                    val ergebnis = verschiebeKarte(
                        kartenStapelComputer.KartenListe,
                        kartenStapelUser.KartenListe,
                        kartenStapelComputer.aktuelleKatennummer
                    )
                    if (ergebnis != null) {
                        kartenStapelComputer.KartenListe = ergebnis.first
                        kartenStapelUser.KartenListe = ergebnis.second
                        setzeNeueKartenNummer(kartenStapelComputer)
                        setzeNeueKartenNummer(kartenStapelUser)
                    }
                } else {
                    Log.d("Deppe-Quartett", "Computer hast gewonnen")
                    // Verschiebe die Karte vom User zum KComputer
                    val ergebnis = verschiebeKarte(
                        kartenStapelUser.KartenListe,
                        kartenStapelComputer.KartenListe,
                        kartenStapelUser.aktuelleKatennummer
                    )
                    if (ergebnis != null) {
                        kartenStapelUser.KartenListe = ergebnis.first
                        kartenStapelComputer.KartenListe = ergebnis.second
                        setzeNeueKartenNummer(kartenStapelComputer)
                        setzeNeueKartenNummer(kartenStapelUser)
                    }
                }
                Log.d(
                    "Deppe-Quartett",
                    "Userkartennummer: " + kartenStapelUser.aktuelleKatennummer.toString() + " Computerkartennummer: " + kartenStapelComputer.aktuelleKatennummer.toString()
                )

                val funktionTextView = findViewById<TextView>(R.id.ergebnis)
                if (kartenStapelUser.aktuelleKatennummer < 0) {
                    funktionTextView.text = "Spielstand: Du hast verlohren"
                } else if (kartenStapelComputer.aktuelleKatennummer < 0) {
                    funktionTextView.text = "Spielstand: Du hast gewonnen"
                } else {
                    funktionTextView.text =
                        kartennamen + " - Deine Karten: " + kartenStapelUser.KartenListe.size.toString() + " Computer Karten:" + kartenStapelComputer.KartenListe.size.toString()
                }
            }
        }

    }

    private fun setzeNeueKartenNummer(kartenStapel: kartenStapel)
    {
        if(kartenStapel.aktuelleKatennummer < kartenStapel.KartenListe.size-1){
            kartenStapel.aktuelleKatennummer += 1
        } else if(kartenStapel.KartenListe.size > 0) {
            kartenStapel.aktuelleKatennummer = 0;
        }
        else{
            kartenStapel.aktuelleKatennummer = -1;
        }
    }

    fun verschiebeKarte(
        quellStapelListe: MutableList<Depp>,
        zielStapelListe: MutableList<Depp>,
        kartenIndexDerZuEntfernendenKarte: Int
    ): Pair<MutableList<Depp>, MutableList<Depp>>? {

        // Erstelle Kopien, um die Originale nicht direkt zu verändern, falls sie außerhalb noch referenziert werden
        // oder um Seiteneffekte zu kontrollieren. Wenn du sicher bist, dass du die
        // übergebenen Listen direkt modifizieren willst und kannst, kannst du auf .toMutableList() verzichten.
        val neueQuellListe = quellStapelListe.toMutableList()
        val neueZielListe = zielStapelListe.toMutableList()

        // Überprüfen, ob der Index im Quellstapel gültig ist
        if (kartenIndexDerZuEntfernendenKarte >= 0 && kartenIndexDerZuEntfernendenKarte < neueQuellListe.size) {
            // 1. Karte aus dem Quellstapel entfernen und das entfernte Objekt erhalten
            val verschobeneKarte: Depp = neueQuellListe.removeAt(kartenIndexDerZuEntfernendenKarte)

            // 2. Die entfernte Karte zum Zielstapel hinzufügen (normalerweise am Ende)
            neueZielListe.add(verschobeneKarte)

            Log.d("KartenVerschiebung", "Karte '${verschobeneKarte.funktion}' von Quelle nach Ziel verschoben.")
            return Pair(neueQuellListe, neueZielListe)
        } else {
            Log.e("KartenVerschiebung", "Ungültiger Index ($kartenIndexDerZuEntfernendenKarte) für Quellstapel der Größe ${neueQuellListe.size}.")
            return null // Oder wirf eine Exception, oder gib die unveränderten Listen zurück
        }
    }


    private fun getSterneString(wert: UInt, sternSymbol: String = "⭐", platzhalterBeiNull: String = "-"): String {
        val anzahl = wert.toInt()
        return if (anzahl > 0) {
            sternSymbol.repeat(anzahl)
        } else {
            platzhalterBeiNull
        }
    }

    // Mache dies zu einer Methode von MainActivity
    fun updateLayout(deppData: Depp) {
        // Jetzt hat die Funktion Zugriff auf findViewById, da sie Teil der Activity ist
        val funktionTextView = findViewById<TextView>(R.id.funktion_2) // Ersetze mit korrekter ID
        funktionTextView.text = deppData.funktion

        val chilligkeitTextView = findViewById<TextView>(R.id.chilligkeit_2) // Ersetze mit korrekter ID
        chilligkeitTextView.text = getSterneString(deppData.chilligkeit)

        val aussehenTextView = findViewById<TextView>(R.id.aussehen_2) // Ersetze mit korrekter ID
        aussehenTextView.text = getSterneString(deppData.aussehen)

        val beliebtheitTextView = findViewById<TextView>(R.id.beliebtheit_2) // Ersetze mit korrekter ID
        beliebtheitTextView.text = getSterneString(deppData.beliebtheit)

        val peinlichkeitTextView = findViewById<TextView>(R.id.Peinlichkeit_2) // Ersetze mit korrekter ID
        peinlichkeitTextView.text = getSterneString(deppData.peinlichkeit)

        val gefarlichkeitTextView = findViewById<TextView>(R.id.gefarlichkeit_2) // Ersetze mit korrekter ID
        gefarlichkeitTextView.text = getSterneString(deppData.gefaerlichkeit)

        val nerfigkeitTextView = findViewById<TextView>(R.id.nerfigkeit_2) // Ersetze mit korrekter ID
        nerfigkeitTextView.text = getSterneString(deppData.nerfigkeit)

        val bayern_genTextView = findViewById<TextView>(R.id.bayern_2) // Ersetze mit korrekter ID
        bayern_genTextView.text = getSterneString(deppData.bayern_gen)

        val deppenfaktorTextView = findViewById<TextView>(R.id.Deppenfaktor_2) // Ersetze mit korrekter ID
        deppenfaktorTextView.text = getSterneString(deppData.deppenfaktor)

        val heldnestatusTextView = findViewById<TextView>(R.id.heldenstatus_2) // Ersetze mit korrekter ID
        heldnestatusTextView.text = getSterneString(deppData.heldnestatus)

        val imageFace = findViewById<ImageView>(R.id.imageFace) // Ersetze mit korrekter ID
        imageFace.setImageResource(deppData.imageResourceId)
    }

    private fun teileKartenAuf() {
        // Hole die vollständige Liste der Deppen
        val alleKarten = LehrerDaten.alleDeppen.toMutableList() // Kopie erstellen, um das Original nicht zu verändern

        // Mische die Karten zufällig
        alleKarten.shuffle() // Kotlin's eingebaute shuffle-Funktion für MutableList

        // Teile die Karten in zwei Hälften
        val anzahlKartenGesamt = alleKarten.size
        val mitte = anzahlKartenGesamt / 2

        kartenStapelComputer.KartenListe = alleKarten.subList(0, mitte)
        kartenStapelUser.KartenListe = alleKarten.subList(mitte, anzahlKartenGesamt)

        kartenStapelComputer.anzahlKarten = kartenStapelComputer.KartenListe.size
        kartenStapelUser.anzahlKarten = kartenStapelUser.KartenListe.size


        // Optional: Logge die Größe der Stapel, um zu prüfen
         Log.d("Kartenverteilung", "Spieler 1 hat ${kartenStapelComputer.KartenListe.size} Karten.")
         Log.d("Kartenverteilung", "Spieler 2 hat ${kartenStapelUser.KartenListe.size} Karten.")
    }
}

class kartenStapel(
    var KartenListe: MutableList<Depp>,
    var anzahlKarten: Int,
    var aktuelleKatennummer: Int
)