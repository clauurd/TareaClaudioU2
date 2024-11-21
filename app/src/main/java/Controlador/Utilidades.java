package Controlador;

import com.example.tareaclaudiou2.R;

import java.util.ArrayList;
import java.util.List;

import Modelo.Libros;

public class Utilidades {
    public static List<Libros> getListLibros(){
        ArrayList<Libros> list = new ArrayList<Libros>();
        list.add(new Libros("El nombre del viento","Atípica, profunda y sincera, El nombre del viento es una novela de aventuras, de historias dentro de otras historias, de misterio, de amistad, de amor, de magia y de superación.", R.drawable.elnombredelviento));
        list.add(new Libros("El temor de un hombre sabio","\"Todo hombre sabio teme tres cosas: la tormenta en el mar, la noche sin luna y la ira de un hombre amable\".\n" +
                "El hombre había desaparecido. El mito no. Músico, mendigo, ladrón, estudiante, mago, trotamundos, heroe y asesino, Kvothe había borrado su rastro. Y ni siquiera ahora que le han encontrado, ni siquiera ahora que las tinieblas invaden los rincones del mundo, está dispuesto a regresar. Pero su historia prosigue, la aventura continúa, y Kvothe seguirá contándola para revelar la verdad tras la leyenda.",R.drawable.eltemordeunhombresabio));
        list.add(new Libros("El rayo que no cesa","Uno de los más conmovedores libros de la poesía castellana contemporánea\n" +
                "Prólogo de Luna Miguel.Edición de Juan Cano Ballesta.Miguel Hernández nació en Orihuela en 1910 y, condenado por su militancia en el bando republicano durante la guerra civil, murió en la cárcel en 1942. Comenzó a escribir poemas siendo pastor de cabras, pero muy pronto alcanzó su gran madurez reflejada en el libroPerito en lunas.EL RAYO QUE NO CESA, resultado y testimonio de una profunda crisis vital, es uno de los más conmovedores libros de poesía castellana. El descubrimiento del amor constituye para el autor una extraordinaria aventura poética. Empieza a explorar una nueva dimensión de su ser y descubre que amor y muerte son cara y cruz de una misma moneda. De ahí brota la vivencia básica de la pena, que rebasando los límites personales, hace al poeta cargar, solidario, con el dolor de todos los desheredados.",R.drawable.elrayoquenocesa));
        list.add(new Libros("El señor de los anillos","Los Anillos de Poder fueron forjados en antiguos tiempos por los herreros Elfos, y Sauron, el Señor Oscuro, forjó el Anillo Único. Pero en una ocasión se lo quitaron, y aunque lo buscó por toda la Tierra Media nunca pudo encontrarlo. Al cabo de muchos años fue a caer casualmente en manos del hobbit Bilbo Bolsón.\n" +
                "\n" +
                "Desde la Torre Oscura de Mordor, el poder de Sauron se extendió alrededor. Llegó a reunir todos los Grandes Anillos, pero continuaba buscando el Anillo Único, que completaría el dominio de Mordor.",R.drawable.elsennordelosanillos));
        list.add(new Libros("La escala de Mohs","El único poemario de una artista polifacética que es todo un referente para varias generaciones: feminista, música y poeta; comprometida y talentosa. Gata Cattana.\n" +
                "\n" +
                "La escala de Mohs es una tabla de diez minerales ordenados por su dureza que se usa para medir la maleabilidad de cualquier otro. Y eso son también estos poemas, una unidad de medida de nuestros principios, como personas y como sociedad, un libro que nos pregunta salvajemente por lo que creemos y nos creemos. Todo el mundo se vende. Yo me vendí por tres milímetros de iris azul tanzanita en cada ojo escribe Gata. Todo el mundo tiene un precio.\n" +
                "\n" +
                "La identidad, la crítica a una sociedad grotesca, el feminismo, el amor, la torpe historia que se repite agónicamente... Todo eso es este libro. Pero ante todo, es el legado de un talento magnífico, el de la politóloga, rapera y poeta Gata Cattana, un mito y una voz imprescindible para nuestras generaciones.",R.drawable.laescalademohs));
        list.add(new Libros("No vine a ser carne","Un libro único e imprescindible: los poemas y textos ineditos de Gata Cattana, la mítica poeta y rapera que enamoró auna generación.\n" +
                "\n" +
                "\"No vine a ser carne, vine a ser espuma\", escribe Gata Cattana lúcidamente en uno de los textos ineditos que contiene este libro y que le da título. Una compilación de letras, poemas y textos en prosa de la Gata que todos conocemos -activista, feminista, reivindicativa, emocional-, pero tambien de aquella Ana más ingenua que comenzaba a escribir y a formarse una idea del mundo y de la realidad.\n" +
                "\n" +
                "La breve pero valiosa obra literaria de la politóloga, rapera y poeta fallecida en 2017 cuyas letras se han convertido en signo de la lucha feminista y de toda una generación se completa con este volumen. Un compendio único y preciado para cualquier seguidor de su música o de sus letras.\n" +
                "\n" +
                "La crítica ha dicho...\"Ella escribía como desafiando al tendío, entre la rabia purísima y una sensibilidad nueva, medio transparente: iluminada como una medium que escrutaba al mundo desde esos ojos llenos de preguntas y eyeliner\".Lorena G. Maldonado en El Español",R.drawable.novineasercarne));
        list.add(new Libros("Las flores del mal","Una de las obras poeticas más importantes y conocidas de la literatura universal.\n" +
                "\n" +
                "La vida de Charles Baudelaire estuvo marcada por los excesos y fue acusado de atentar contra la moral pública, lo que le convirtió en un poeta maldito. Enfrentado y atraído durante toda su vida por lo divino y lo diabólico, sus poemas encuentran la belleza y lo sublime en la realidad más trivial y lo “no bello”, imprimiendo así una nueva estetica en la poesía moderna.á",R.drawable.lasfloresdelmal));
        list.add(new Libros("La sangre del olimpo","Un ejercito de gigantes. Dos batallas a vida o muerte. Y siete heroes dispuestos a impedir el fin del mundo.\n" +
                "Los tripulantes del Argo II han salido victoriosos de sus misiones, pero están lejos de derrotar a Gaia, la Madre Tierra. Ella ha conseguido alzar a todos sus gigantes y planea sacrificar a dos semidioses en la festividad de Spes: necesita su sangre, la sangre del Olimpo, para despertar.\n" +
                "\n" +
                "Por otro lado, la legión romana del Campamento Júpiter, liderada por Octavio, está cada día más cerca del Campamento Mestizo. La Atenea Partenosdeberá dirigirse al oeste para impedir la guerra entre los campamentos, mientras el Argo II navega hacia Antenas...\n" +
                "\n" +
                "¿Cómo podrán los jóvenes semidioses derrotar a los gigantes de Gaia? Ya han sacrificado demasiado, pero si Gaia despierta... será el final.",R.drawable.lasangredelolimpo));
        list.add(new Libros("Las tinieblas y el alba","En Las tinieblas y el alba, Ken Follett embarca al lector en un épico viaje que termina donde Los pilares de la Tierra comienza.\n" +
                "\n" +
                "Año 997, finales de la Edad Oscura. Inglaterra se enfrenta a los ataques de los galeses por el oeste y de los vikingos por el este. La vida es difícil y aquellos que ostentan algo de poder lo ejercen con puño de hierro y, a menudo, en conflicto con el propio rey.\n" +
                "\n" +
                "En estos tiempos turbulentos, tres vidas se entrecruzan: el joven constructor de barcos Edgar, a punto de fugarse con la mujer a la que ama, comprende que su futuro será muy diferente a lo que había imaginado cuando su hogar es arrasado por los vikingos; Ragna, la rebelde hija de un noble normando, acompaña a su marido a una nueva tierra al otro lado del mar solo para descubrir que las costumbres allí son peligrosamente distintas; y Aldred, un monje idealista, sueña con transformar su humilde abadía en un centro de saber admirado en toda Europa. Los tres se verán abocados a un enfrentamiento con el despiadado obispo Wynstan, decidido a aumentar su poder a cualquier precio.",R.drawable.lastinieblasyelalba));
        list.add(new Libros("La cancion de Aquiles","De la autora de Circe, una epopeya inolvidable\n" +
                "\n" +
                "Grecia en la era de los heroes. Patroclo, un príncipe joven y torpe, ha sido exiliado al reino de Ftía, donde vive a la sombra del rey Peleo y su hijo divino, Aquiles.\n" +
                "\n" +
                "Aquiles, el mejor de los griegos, es todo lo que no es Patroclo: fuerte, apuesto, hijo de una diosa. Un día Aquiles toma bajo su protección al lastimoso príncipe y ese vínculo provisional da paso a una sólida amistad mientras ambos se convierten en jóvenes habilidosos en las artes de la guerra.\n" +
                "\n" +
                "Pero el destino nunca está lejos de los talones de Aquiles. Cuando se extiende la noticia del rapto de Helena de Esparta, se convoca a los hombres de Grecia para asediar la ciudad de Troya. Aquiles, seducido por la promesa de un destino glorioso, se une a la causa, y Patroclo, dividido entre el amor y el miedo por su compañero, lo sigue a la guerra. Poco podía imaginar que los años siguientes iban a poner a prueba todo cuanto habían aprendido y todo cuanto valoraban profundamente.",R.drawable.lacanciondeaquiles));





        return list;
    }
}
