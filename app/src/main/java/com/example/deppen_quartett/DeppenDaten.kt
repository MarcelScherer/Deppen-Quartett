package com.example.deppen_quartett

import androidx.annotation.DrawableRes

// Die Depp-Datenklasse, falls noch nicht an zentraler Stelle definiert.
// Es ist besser, sie einmal zu definieren und von überall zu verwenden.
data class Depp(
    val funktion: String,
    val chilligkeit: UInt,
    val aussehen: UInt,
    val beliebtheit: UInt,
    val peinlichkeit: UInt,
    val gefaerlichkeit: UInt,
    val nerfigkeit: UInt,
    val bayern_gen: UInt,
    val deppenfaktor: UInt,
    val heldnestatus: UInt,
    @DrawableRes val imageResourceId: Int
)

object LehrerDaten {
    val frauWeider = Depp(
        funktion = "Musiklehrerin",
        chilligkeit = 7u,
        aussehen = 6u,
        beliebtheit = 7u,
        peinlichkeit = 2u,
        gefaerlichkeit = 1u,
        nerfigkeit = 1u,
        bayern_gen = 4u,
        deppenfaktor = 1u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.frau_weider // Stelle sicher, dass diese Ressource existiert
    )

    val frauLiebig = Depp(
        funktion = "Mathelehrerin",
        chilligkeit = 6u,
        aussehen = 2u,
        beliebtheit = 6u,
        peinlichkeit = 6u,
        gefaerlichkeit = 2u,
        nerfigkeit = 2u,
        bayern_gen = 4u,
        deppenfaktor = 3u,
        heldnestatus = 3u,
        imageResourceId = R.drawable.frau_lieblich // Stelle sicher, dass diese Ressource existiert
    )

    val misRunzheimer = Depp(
        funktion = "Englischlehrerin",
        chilligkeit = 3u,
        aussehen = 1u,
        beliebtheit = 2u,
        peinlichkeit = 6u,
        gefaerlichkeit = 5u,
        nerfigkeit = 6u,
        bayern_gen = 1u,
        deppenfaktor = 6u,
        heldnestatus = 2u,
        imageResourceId = R.drawable.frau_runzheimer // Beispiel: Eigene Ressource, stelle sicher, dass sie existiert
    )

    val herrWitzl = Depp(
        funktion = "Sportlehrer",
        chilligkeit = 7u,
        aussehen = 4u,
        beliebtheit = 5u,
        peinlichkeit = 3u,
        gefaerlichkeit = 3u,
        nerfigkeit = 2u,
        bayern_gen = 5u,
        deppenfaktor = 3u,
        heldnestatus = 5u,
        imageResourceId = R.drawable.herr_witzl // Beispiel: Eigene Ressource, stelle sicher, dass sie existiert
    )

    val seppiHinterholzer = Depp(
        funktion = "Held der Schule",
        chilligkeit = 7u,
        aussehen = 7u,
        beliebtheit = 7u,
        peinlichkeit = 1u,
        gefaerlichkeit = 7u,
        nerfigkeit = 1u,
        bayern_gen = 7u,
        deppenfaktor = 1u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.seppi_hinterholzer
    )

    val schakeline = Depp(
        funktion = "Nervtäterin",
        chilligkeit = 4u,
        aussehen = 1u,
        beliebtheit = 1u,
        peinlichkeit = 7u,
        gefaerlichkeit = 7u,
        nerfigkeit = 7u,
        bayern_gen = 1u,
        deppenfaktor = 7u,
        heldnestatus = 1u,
        imageResourceId = R.drawable.schackeline
    )

    val herKillerMiller = Depp(
        funktion = "Direktor",
        chilligkeit = 2u,
        aussehen = 1u,
        beliebtheit = 1u,
        peinlichkeit = 4u,
        gefaerlichkeit = 7u,
        nerfigkeit = 4u,
        bayern_gen = 7u,
        deppenfaktor = 5u,
        heldnestatus = 3u,
        imageResourceId = R.drawable.her_killer_miller
    )

    val herrRammelmeyer = Depp(
        funktion = "Deutschlehrer",
        chilligkeit = 1u,
        aussehen = 1u,
        beliebtheit = 1u,
        peinlichkeit = 5u,
        gefaerlichkeit = 7u,
        nerfigkeit = 6u,
        bayern_gen = 2u,
        deppenfaktor = 7u,
        heldnestatus = 2u,
        imageResourceId = R.drawable.herr_rammelmeyer
    )

    val hansi = Depp(
        funktion = "Bester Freund",
        chilligkeit = 6u,
        aussehen = 4u,
        beliebtheit = 6u,
        peinlichkeit = 2u,
        gefaerlichkeit = 7u,
        nerfigkeit = 2u,
        bayern_gen = 7u,
        deppenfaktor = 1u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.hansi
    )

    val luis_und_leon = Depp(
        funktion = "Mitchiller",
        chilligkeit = 7u,
        aussehen = 5u,
        beliebtheit = 5u,
        peinlichkeit = 3u,
        gefaerlichkeit = 3u,
        nerfigkeit = 2u,
        bayern_gen = 6u,
        deppenfaktor = 2u,
        heldnestatus = 5u,
        imageResourceId = R.drawable.luis_und_leon
    )

    val kevin = Depp(
        funktion = "Schulschleimer",
        chilligkeit = 5u,
        aussehen = 6u,
        beliebtheit = 6u,
        peinlichkeit = 3u,
        gefaerlichkeit = 7u,
        nerfigkeit = 3u,
        bayern_gen = 2u,
        deppenfaktor = 2u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.kevin_machtlfinger
    )

    val herr_fritte = Depp(
        funktion = "Erdkundelehrer",
        chilligkeit = 6u,
        aussehen = 1u,
        beliebtheit = 5u,
        peinlichkeit = 7u,
        gefaerlichkeit = 1u,
        nerfigkeit = 4u,
        bayern_gen = 6u,
        deppenfaktor = 6u,
        heldnestatus = 3u,
        imageResourceId = R.drawable.herr_fritte
    )

    val merlin = Depp(
        funktion = "Hosenscheisser",
        chilligkeit = 1u,
        aussehen = 2u,
        beliebtheit = 3u,
        peinlichkeit = 7u,
        gefaerlichkeit = 2u,
        nerfigkeit = 5u,
        bayern_gen = 1u,
        deppenfaktor = 6u,
        heldnestatus = 2u,
        imageResourceId = R.drawable.merlin
    )

    val herr_glas = Depp(
        funktion = "Geschichtsleher",
        chilligkeit = 7u,
        aussehen = 5u,
        beliebtheit = 6u,
        peinlichkeit = 2u,
        gefaerlichkeit = 2u,
        nerfigkeit =2u,
        bayern_gen = 6u,
        deppenfaktor = 2u,
        heldnestatus = 3u,
        imageResourceId = R.drawable.herr_glas
    )

    val herr_bleibimhaus = Depp(
        funktion = "Hausmeister",
        chilligkeit = 7u,
        aussehen = 2u,
        beliebtheit = 7u,
        peinlichkeit = 3u,
        gefaerlichkeit = 1u,
        nerfigkeit =2u,
        bayern_gen = 7u,
        deppenfaktor = 3u,
        heldnestatus = 5u,
        imageResourceId = R.drawable.herr_bleibimhaus
    )

    val luigi = Depp(
        funktion = "Italienischer Dönermann",
        chilligkeit = 4u,
        aussehen = 5u,
        beliebtheit = 7u,
        peinlichkeit = 2u,
        gefaerlichkeit = 2u,
        nerfigkeit =3u,
        bayern_gen = 1u,
        deppenfaktor = 4u,
        heldnestatus = 4u,
        imageResourceId = R.drawable.luigi
    )

    val vroni = Depp(
        funktion = "nervige Schwester",
        chilligkeit = 1u,
        aussehen = 2u,
        beliebtheit = 2u,
        peinlichkeit = 6u,
        gefaerlichkeit = 4u,
        nerfigkeit =7u,
        bayern_gen = 5u,
        deppenfaktor = 7u,
        heldnestatus = 1u,
        imageResourceId = R.drawable.vroni
    )

    val hausneerbauernlenz = Depp(
        funktion = "Biobauer",
        chilligkeit = 5u,
        aussehen = 2u,
        beliebtheit = 3u,
        peinlichkeit = 4u,
        gefaerlichkeit = 3u,
        nerfigkeit =3u,
        bayern_gen = 5u,
        deppenfaktor = 4u,
        heldnestatus = 4u,
        imageResourceId = R.drawable.hausnerbauernlenz
    )

    val pfarrer = Depp(
        funktion = "Pfarrer",
        chilligkeit = 2u,
        aussehen = 2u,
        beliebtheit = 2u,
        peinlichkeit = 4u,
        gefaerlichkeit = 3u,
        nerfigkeit =4u,
        bayern_gen = 2u,
        deppenfaktor = 4u,
        heldnestatus = 2u,
        imageResourceId = R.drawable.pfarrer
    )

    val lili = Depp(
        funktion = "Grosse Liege",
        chilligkeit = 4u,
        aussehen = 7u,
        beliebtheit = 7u,
        peinlichkeit = 1u,
        gefaerlichkeit = 3u,
        nerfigkeit =2u,
        bayern_gen = 4u,
        deppenfaktor = 1u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.lili
    )

    val mama = Depp(
        funktion = "Mama",
        chilligkeit = 1u,
        aussehen = 2u,
        beliebtheit = 2u,
        peinlichkeit = 7u,
        gefaerlichkeit = 7u,
        nerfigkeit =7u,
        bayern_gen = 7u,
        deppenfaktor = 3u,
        heldnestatus = 5u,
        imageResourceId = R.drawable.mama
    )

    val papa = Depp(
        funktion = "Papa",
        chilligkeit = 6u,
        aussehen = 4u,
        beliebtheit = 5u,
        peinlichkeit = 6u,
        gefaerlichkeit = 4u,
        nerfigkeit =3u,
        bayern_gen = 5u,
        deppenfaktor = 2u,
        heldnestatus = 3u,
        imageResourceId = R.drawable.mama
    )

    val johnny = Depp(
        funktion = "Allzweckwaffe",
        chilligkeit = 7u,
        aussehen = 4u,
        beliebtheit = 5u,
        peinlichkeit = 4u,
        gefaerlichkeit = 3u,
        nerfigkeit =2u,
        bayern_gen = 6u,
        deppenfaktor = 2u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.johmmy
    )

    val opa = Depp(
        funktion = "Oberchiller",
        chilligkeit = 7u,
        aussehen = 6u,
        beliebtheit = 7u,
        peinlichkeit = 2u,
        gefaerlichkeit = 6u,
        nerfigkeit =1u,
        bayern_gen = 7u,
        deppenfaktor = 1u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.opa
    )

    val oma = Depp(
        funktion = "Metzgereifachverkäuferin",
        chilligkeit = 1u,
        aussehen = 2u,
        beliebtheit = 4u,
        peinlichkeit = 7u,
        gefaerlichkeit = 7u,
        nerfigkeit =5u,
        bayern_gen = 7u,
        deppenfaktor = 4u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.oma
    )

    val kevinsMum = Depp(
        funktion = "Geilste Mutter der Welt",
        chilligkeit = 7u,
        aussehen = 7u,
        beliebtheit = 7u,
        peinlichkeit = 1u,
        gefaerlichkeit = 4u,
        nerfigkeit = 1u,
        bayern_gen = 3u,
        deppenfaktor = 1u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.kevins_mum
    )

    val jaqueline = Depp(
        funktion = "coole Chillerin",
        chilligkeit = 7u,
        aussehen = 5u,
        beliebtheit = 5u,
        peinlichkeit = 3u,
        gefaerlichkeit = 6u,
        nerfigkeit = 2u,
        bayern_gen = 1u,
        deppenfaktor = 2u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.jaqueline
    )

    val neuer_kevin = Depp(
        funktion = "Chilmaster",
        chilligkeit = 7u,
        aussehen = 6u,
        beliebtheit = 6u,
        peinlichkeit = 2u,
        gefaerlichkeit = 7u,
        nerfigkeit = 1u,
        bayern_gen = 3u,
        deppenfaktor = 1u,
        heldnestatus = 7u,
        imageResourceId = R.drawable.neuer_kevin
    )

    val pater = Depp(
        funktion = "Der Schulmönch",
        chilligkeit = 3u,
        aussehen = 1u,
        beliebtheit = 2u,
        peinlichkeit = 5u,
        gefaerlichkeit = 3u,
        nerfigkeit = 4u,
        bayern_gen = 6u,
        deppenfaktor = 3u,
        heldnestatus = 4u,
        imageResourceId = R.drawable.pater_baptissimus
    )

    val tante = Depp(
        funktion = "Die Extrem-Macherin",
        chilligkeit = 4u,
        aussehen = 2u,
        beliebtheit = 4u,
        peinlichkeit = 7u,
        gefaerlichkeit = 1u,
        nerfigkeit = 4u,
        bayern_gen = 5u,
        deppenfaktor = 4u,
        heldnestatus = 5u,
        imageResourceId = R.drawable.tante_uschi
    )

    val jessy = Depp(
        funktion = "Schosshündchen",
        chilligkeit = 1u,
        aussehen = 4U,
        beliebtheit = 1u,
        peinlichkeit = 6u,
        gefaerlichkeit = 5u,
        nerfigkeit = 6u,
        bayern_gen = 1u,
        deppenfaktor = 7u,
        heldnestatus = 1u,
        imageResourceId = R.drawable.jessy
    )

    val wellenschleager = Depp(
        funktion = "Der harte Lehrerhund",
        chilligkeit = 7u,
        aussehen = 5U,
        beliebtheit = 4u,
        peinlichkeit = 1u,
        gefaerlichkeit = 6u,
        nerfigkeit = 3u,
        bayern_gen = 5u,
        deppenfaktor = 2u,
        heldnestatus = 6u,
        imageResourceId = R.drawable.wellenschlaeger
    )

    val linus = Depp(
        funktion = "Mega-Dumpfbacke",
        chilligkeit = 4u,
        aussehen = 1U,
        beliebtheit = 1u,
        peinlichkeit = 7u,
        gefaerlichkeit = 2u,
        nerfigkeit = 7u,
        bayern_gen = 1u,
        deppenfaktor = 7u,
        heldnestatus = 2u,
        imageResourceId = R.drawable.linus
    )

    val yannik = Depp(
        funktion = "Parallelklassendepp",
        chilligkeit = 1u,
        aussehen = 1U,
        beliebtheit = 1u,
        peinlichkeit = 7u,
        gefaerlichkeit = 7u,
        nerfigkeit = 7u,
        bayern_gen = 1u,
        deppenfaktor = 7u,
        heldnestatus = 1u,
        imageResourceId = R.drawable.yannik
    )

    // Optional: Eine Liste aller Lehrer für einfacheren Zugriff
    val alleDeppen: List<Depp> = listOf(frauWeider, frauLiebig, misRunzheimer, herrWitzl, seppiHinterholzer, schakeline, herKillerMiller, herrRammelmeyer,
        hansi, luis_und_leon, kevin, herr_fritte, merlin, herr_glas, herr_bleibimhaus, luigi, vroni, hausneerbauernlenz, pfarrer, lili, mama, papa,
        johnny, opa, oma, kevinsMum, jaqueline, neuer_kevin, pater, tante, jessy, wellenschleager, linus, yannik)
}