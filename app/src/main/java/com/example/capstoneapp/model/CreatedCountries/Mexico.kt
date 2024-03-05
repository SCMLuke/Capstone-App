package com.example.capstoneapp.model.CreatedCountries

import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CulturalCenters
import com.example.capstoneapp.model.Food
import com.example.capstoneapp.model.HistoricalSites
import com.example.capstoneapp.model.Museums

class Mexico {
    companion object {
        val mexico = Country("Mexico",
            "Country in North America",
            // Historical Sites
            listOf(
                HistoricalSites(
                    "Tenochtitlan / Historic Center of Mexico City",
                    "Originally built by the Aztecs and serving as their capital in the 1300s. It\n" +
                            "was destroyed by a Spanish invasion in 1521, with Mexico City being built\n" +
                            "over the ruins.",
                    19.280603385440596,
                    -99.05833316348213
                ),
                HistoricalSites(
                    "Palenque",
                    "An ancient city of the Maya civilization. It is estimated the site was\n" +
                            "abandoned anywhere between 226 BC - 799 AD. It was buried\n" +
                            "underneath vast amounts of Jungle trees, but has been excavated and\n" +
                            "restored.",
                    17.48496926149535,
                    -92.04587274243926
                ),
                HistoricalSites(
                    "Chichen Itza",
                    "An ancient city of the Maya civilization. Featuring the famous Temple of\n" +
                            "Kukulcan, this city is thought to have had a diverse population of\n" +
                            "inhabitants, due to the variations of architectural styles found at the site.",
                    20.684443400856715,
                    -88.5677745263475
            )),
            // Cultural Centers
            listOf(
                CulturalCenters(
                    "Casa Lamm",
                    "Located in Colonia Roma, this house was built in the early 20th century,\n" +
                            "and restored in 1994 to serve as a cultural center. Today it is an exhibition\n" +
                            "space for art, and hosts a bookstore and a restaurant.",
                    19.418758546991974,
                    -99.1593258108108

                ),
                CulturalCenters(
                    "Tijuana Cultural Center",
                    "A large, ball-shaped facility that hosts various exhibits, including a movie\n" +
                            "theater that displays cultural films, a garden, a restaurant, and more.",
                    32.53039944904854,
                    -117.02351072588148
                ),
                CulturalCenters(
                    "Centro Cultural de España",
                    "A mansion originally left in ruins, it was ceded to the Spanish government\n" +
                            "who restored the building. It is now used primarily as an art exhibit for both\n" +
                            "Spanish and Mexican artists. It also features a cafe and gift shop.",
                    19.759243333333977,
                    -99.02085439754318
                )),
            // Museums
            listOf(
                Museums(
                    "Anahuacalli Museum",
                    "Museum and arts center located in Coyoacan. Features architecture\n" +
                            "inspired by mesoamerican structures.",
                    19.32322405021173,
                    -99.14392659626924
                ),
                Museums(
                    "Francisco Villa Museum",
                    "A museum located in Chihuahua, dedicated to the life of the Mexican\n" +
                            "revolutionary Francisco “Pancho” Villa. Features large amounts of\n" +
                            "memorabilia related to his life.",
                    28.627142627032896,
                    -106.06848523861703
                ),
                Museums(
                    "National Museum of Anthropology",
                    "The largest museum in Mexico, this museum features tons of\n" +
                            "archaeological and anthropological artifacts, dating back to pre-Columbian\n" +
                            "Mexico.",
                    19.426275630426055,
                    -99.18631607838634
                )),
            // Food
            listOf(
                Food(
                    " Pujol",
                    " Mexican cuisine spearheaded by Enrique Olvera. Currently ranked #9 on\n" +
                            "‘The World’s 50 Best Restaurants’ list. It is also rated as the best\n" +
                            "restaurant in Mexico City by the Wall Street Journal.",
                    19.43249767573161,
                    -99.19480246900129
                ),
                Food(
                    "Quintonil",
                    " Headed by Alejandra Flores and Jorge Vallejo, this restaurant offers\n" +
                            "traditional Mexican food from the talented duo.",
                    19.431060904710172,
                    -99.19184563903967
                ))
        )
    }
}