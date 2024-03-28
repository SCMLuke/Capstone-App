package com.example.capstoneapp.model.CreatedCountries

import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CulturalCenters
import com.example.capstoneapp.model.Food
import com.example.capstoneapp.model.HistoricalSites
import com.example.capstoneapp.model.Museums

class Bhutan {
    val bhutan = Country( "Bhutan",
        "Country in Asia",
        listOf(
            HistoricalSites(
                "Paro Taktsang (Tiger's Nest)",
                "A sacred monastery perched on a cliffside in the Paro Valley.",
                27.497467485456546,
                89.36415557232147
            ),
            HistoricalSites(
                "Punakha Dzong",
                "A fortress and monastery at the confluence of the Pho Chhu and Mo Chhu\n" +
                        "rivers.",
                27.582403598539738,
                89.86345948110589
            ),
            HistoricalSites(
                "Trongsa Dzong",
                "A fortress and Buddhist monastery located in Trongsa.",
                27.500377186799952,
                90.5077851696808
            )
        ),
        listOf(
            CulturalCenters(
                "Royal Textile Academy of Bhutan",
                "Located in Thimphu, dedicated to preserving and promoting Bhutanese\n" +
                        "textile arts.",
                27.479223285609354,
                89.63656548510407
            ),
            CulturalCenters(
                "Folk Heritage Museum",
                "A museum in Thimphu showcasing traditional Bhutanese rural life.",
                27.545014385272008, 89.63405113182888
            ),
            CulturalCenters(
                "Bhutan Institute of Martial Arts",
                "A center for learning traditional Bhutanese martial arts.",
                27.44412662599993, 89.66340590188473
            )
        ),
        listOf(
            Museums(
                "National Museum of Bhutan",
                "Located in Paro, showcasing Bhutanese art, artifacts, and cultural\n" +
                        "heritage.",
                27.429178495545752, 89.42681481152503
            ),
            Museums(
                "Simply Bhutan - Museum & Restaurant",
                "In Thimphu, this museum provides insights into Bhutanese culture and\n" +
                        "traditions.",
                27.47191277845528, 89.63102579296023
            ),
            Museums(
                "Bhutan Postal Museum",
                "Located in Thimphu, showcasing the history of Bhutanese postage and\n" +
                        "philately.",
                27.474647326492068,
                89.63892205059211
            )
        ),
        listOf(
            Food(
                "Druk PNB Restaurant",
                "A restaurant in Thimphu offering Bhutanese, Indian, and international\n" +
                        "cuisine.",
                27.47048301714969,
                89.63969615964108
            ),
            Food(
                "Sonam Trophel Restaurant",
                "Located in Paro, known for its traditional Bhutanese dishes.",
                27.431240447325877,
                89.41401124749777
            ),
            Food(
                "Zombala Restaurant",
                "A popular restaurant in Punakha, offering a mix of Bhutanese and\n" +
                        "international dishes.",
                27.472847144832112,
                89.63747487998162
            )
        )
    )
}