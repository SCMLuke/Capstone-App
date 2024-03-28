package com.example.capstoneapp.model.CreatedCountries

import com.example.capstoneapp.model.Country
import com.example.capstoneapp.model.CulturalCenters
import com.example.capstoneapp.model.Food
import com.example.capstoneapp.model.HistoricalSites
import com.example.capstoneapp.model.Museums

class Argentina {
    val argentina = Country( "Argentina",
        "Country in South America",
        listOf(
            HistoricalSites(
                "Perito Moreno Glacier",
                "A stunning glacier located in Los Glaciares National Park, known for its\n" +
                        "dynamic ice formations.",
                -50.49499240041876,
                -73.13820063509233
            ),
            HistoricalSites(
                "Quebrada de Humahuaca",
                "A UNESCO World Heritage site in the Andes, featuring colorful rock\n" +
                        "formations and ancient cultural landscapes",
                -23.09663080860723,
                -65.33247522036159
            ),
            HistoricalSites(
                "Jesuit Block and Estancias of Córdoba",
                "Historic Jesuit missions and estancias in Córdoba, showcasing colonial architecture.",
                -31.39922825525485,
                -64.18254382415259
            )
        ),
        listOf(
            CulturalCenters(
                "Teatro Colón",
                "A world-renowned opera house and cultural venue in Buenos Aires.",
                -34.516614876340576,
                -58.40456096897265
            ),
            CulturalCenters(
                "Latin American Art Museum of Buenos Aires",
                "Contemporary art museum featuring works by Latin American artists.",
                -34.5759375751303,
                -58.40335701825997
            ),
            CulturalCenters(
                "Manzana de las Luces",
                "A historic and cultural complex in Buenos Aires, known for its colonial-era\n" +
                        "buildings and tunnels.\n",
                -34.60874060891406,
                -58.37494990615472
            )
        ),
        listOf(
            Museums(
                "Museo Nacional de Bellas Artes",
                "Located in Buenos Aires, this museum showcases a vast collection of fine\n" +
                        "arts.",
                -34.58256915020516,
                -58.39292650782186
            ),
            Museums(
                "Museo Nacional de Antropología",
                "Situated in Buenos Aires, it focuses on anthropology and archaeology.",
                19.427371731916033,
                -99.18628382834906
            )
        ),
        listOf(
            Food(
                "Parrilla Don Julio",
                "A renowned steakhouse in Buenos Aires, offering traditional Argentine\n" +
                        "barbecue (asado).",
                -34.564683829483876,
                -58.43191193006668
            ),
            Food(
                "El Preferido de Palermo",
                "A classic Argentine restaurant in Buenos Aires, known for its traditional\n" +
                        "cuisine.",
                -34.58450342545513,
                -58.42549355318952
            ),
            Food(
                "La Cabrera",
                "Famous for its parrilla (grilled meats) in Buenos Aires.\n",
                -34.58450201048097,
                -58.43314180980491
            )
        )
    )
}