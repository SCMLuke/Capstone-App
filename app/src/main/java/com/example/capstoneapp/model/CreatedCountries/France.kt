package com.example.capstoneapp.model.CreatedCountries

import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CulturalCenters
import com.example.capstoneapp.model.Food
import com.example.capstoneapp.model.HistoricalSites
import com.example.capstoneapp.model.Museums

class France {
    companion object {
        val france = Country("France",
            "Country in Western Europe",
            listOf(
                HistoricalSites(
                    "Notre-Dame Cathedral",
                    "Iconic Gothic cathedral in Paris, known for its stunning architecture and\n" +
                            "historical significance.",
                    48.85522475770504,
                    2.349801905493995
                ),
                HistoricalSites(
                    "Carcassonne",
                    " Medieval fortress city in the south of France, featuring well-preserved\n" +
                            "walls and towers.",
                    43.2137099224649,
                    2.350938435552216
                ),
                HistoricalSites(
                    "Lascaux Caves",
                    "Prehistoric cave complex in the Dordogne region, famous for its Paleolithic\n" +
                            "cave paintings.",
                    45.05488795285252,
                    1.1673077574827717
                )
            ),
            listOf(
                CulturalCenters(
                    "Cité des Sciences et de l'Industrie",
                    " Science museum and exhibition center in Paris, dedicated to scientific and\n" +
                            "technological advancements.",
                    48.89568645335506,
                    2.3878835025883594
                ),
                CulturalCenters(
                    "Musée Rodin",
                    "Located in Paris, this museum showcases the works of the renowned\n" +
                            "sculptor Auguste Rodin, including The Thinker.",
                    48.85546371318635,
                    2.3157541412422558
                ),
                CulturalCenters(
                    "Avignon Festival",
                    "Annual arts festival held in the city",
                    43.9350449123063,
                    4.860706591145157
                )
            ),
        listOf(
            Museums(
                "Musée Picasso",
                "Located in Paris, this museum houses an extensive collection of artworks\n" +
                        "by the legendary artist Pablo Picasso.",
                48.85973326861955,
                2.3626284466777334
            ),
            Museums(
                "Musée Marmottan Monet",
                "Art museum in Paris, focusing on the works of Impressionist painter\n" +
                        "Claude Monet and other artists.",
                48.859310652205735,
                2.267265753754913
            ),
            Museums(
                "Musée National du Moyen Âge (Cluny Museum)",
                "Situated in Paris, this museum is dedicated to medieval art and culture,\n" +
                        "housed in the historic Cluny Abbey.",
                48.850553841420975,
                2.3440754393070065
            )
        ),
        listOf(
            Food(
                "Le Jules Verne",
                "Michelin-starred restaurant located in the Eiffel Tower, offering gourmet\n" +
                        "French cuisine with panoramic views of Paris.",
                48.85844033005992,
                2.294488668195529
            ),
            Food(
                "Restaurant Guy Savoy",
                "Sophisticated restaurant offering high-concept a la carte & fixed-price\n" +
                        "menus, plus wine pairings.",
                48.856739859696276,
                2.3391598234962383
            ),
            Food(
                "Alsace Wine Route",
                " Explore the vineyards and charming villages along the Alsace Wine\n" +
                        "Route, known for its Alsatian wines and culinary delights.",
                48.57495831362561,
                7.743970962916591
            )
        ))
    }
}