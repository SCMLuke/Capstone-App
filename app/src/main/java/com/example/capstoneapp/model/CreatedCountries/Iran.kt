package com.example.capstoneapp.model.CreatedCountries

import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CulturalCenters
import com.example.capstoneapp.model.Food
import com.example.capstoneapp.model.HistoricalSites
import com.example.capstoneapp.model.Museums

class Iran {
    val iran = Country("Iran",
        "Country in the Middle East",
        listOf(
            HistoricalSites(
                "Persepolis",
                "Ancient ceremonial capital of the Achaemenid Empire.",
                30.01096799580078,
                52.874938751928816
            ),
            HistoricalSites(
                "Naqsh-e Jahan Square",
                "Historic square in Isfa,han with landmarks like the Shah Mosque and Ali\n" +
                        "Qapu Palace",
                32.65791043303742,
                51.677407537235155
            ),
            HistoricalSites(
                "Pasargadae",
                "Former capital of Achaemenid Empire & archeological site with a tomb that may hold Cyrus the Great.",
                30.200988447643123,
                53.177749155321635
            )
        ),
        listOf(
            CulturalCenters(
                "Niavaran Cultural Center",
                "Cultural complex in Tehran hosting exhibitions and events.",
                35.80874740179845,
                51.469023564637865
            ),
            CulturalCenters(
                "Isfahan City Center",
                "The largest shopping malls in the world, with various cultural complexes found within.",
                32.55218169941618,
                51.68866333816278
            )
        ),
        listOf(
            Museums(
                "National Museum of Iran",
                "Located in Tehran, it houses artifacts from different periods.",
                35.68723182339257,
                51.41447645398321
            ),
            Museums(
                "Carpet Museum of Iran",
                "Situated in Tehran, showcasing a diverse collection of Persian carpets.",
                35.71477688685629,
                51.39047467841693
            ),
            Museums(
                "Sa'dabad Complex",
                "Historical complex in Tehran with several museums.",
                35.816295099997284,
                51.42397342687213
            )
        ),
        listOf(
            Food(
                "Abbasi Hotel Restaurant",
                "Located in Isfahan, part of the historic Abbasi Hotel, offering traditional\n" +
                        "Iranian and international cuisine.",
                32.65160624679226,
                51.67048216346282
            ),
            Food(
                "Shahrzad Restaurant",
                "A well-known restaurant in Tehran, providing a diverse menu of Iranian\n" +
                        "dishes in an elegant setting.",
                32.65062639466063,
                51.666882091398634
            ),
            Food(
                "Haft Khan Restaurant",
                "Situated in Shiraz, known for its Persian cuisine and cozy atmosphere.",
                29.633968077700498,
                52.55692836089614
            )
        )
    )
}