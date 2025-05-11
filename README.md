# AMS-CORE_TRIBUTARIO
<h1>Hello! I'm Eduardo Bustillos <img src="https://raw.githubusercontent.com/iampavangandhi/iampavangandhi/master/gifs/Hi.gif" width="30px"> 🚀</h1>
<h2>Frontend Developer 🎨 and Content Creator 📽</h2>

### Saludo


### Lamina Introducción
🎤 Inicio general

“En esta lámina se presentan los conceptos clave que enmarcan la investigación sobre arquitectura de microservicios y su impacto en la escalabilidad y mantenibilidad de sistemas. Cada uno de estos elementos ha tenido un rol importante en la evolución del desarrollo de software.” 

🧱 Arquitectura de software

“Comenzamos con la evolución de la arquitectura de software. A lo largo de los últimos 20 años, hemos pasado de modelos monolíticos a enfoques más distribuidos, como SOA, y finalmente a los microservicios, que se han convertido en una tendencia dominante gracias a su modularidad y flexibilidad.”

🧩 Microservicios

“Los microservicios representan una evolución clave. Se trata de pequeños servicios autónomos que se comunican entre sí, lo que facilita el mantenimiento, la escalabilidad y la implementación continua, características ideales para sistemas complejos como el de Gestión Tributaria.”

🛠 Prácticas de Desarrollo Ágil y DevOps

“La adopción de microservicios se ve fortalecida por prácticas como el Desarrollo Ágil y DevOps, que permiten una entrega continua y colaborativa. Empresas como Netflix o Amazon implementaron estas prácticas junto con microservicios para escalar y mantener sus sistemas más eficientemente.”

💻 Plataformas y herramientas

“El uso de microservicios se apoya en un ecosistema robusto de plataformas y herramientas: contenedores, orquestadores como Kubernetes, herramientas de monitoreo como Prometheus y sistemas de trazabilidad que permiten controlar y optimizar cada servicio de forma independiente.” 

🧩 Cierre 

“Esta introducción justifica por qué es fundamental considerar una arquitectura de microservicios en procesos complejos. En este caso, en el Proceso de Gestión Tributaria, buscamos resolver limitaciones actuales en escalabilidad y mantenibilidad adoptando este enfoque moderno.”

### Importancia del tema
La presente investigación cobra relevancia debido a que muchas instituciones, especialmente del sector público, continúan operando con sistemas desarrollados bajo arquitecturas monolíticas. Este enfoque tradicional presenta serias limitaciones para escalar eficientemente, incorporar nuevas funcionalidades y responder con agilidad a los cambios del entorno.

Los sistemas monolíticos tienden a concentrar toda la lógica de negocio en una única unidad, lo que genera un fuerte acoplamiento entre componentes, incrementa la complejidad estructural y dificulta su mantenimiento evolutivo. Estas restricciones afectan directamente la eficiencia operativa y la capacidad de adaptación tecnológica de las organizaciones.

Ante este contexto, se evidencia la necesidad de una reingeniería de software que adopte principios modernos como la modularidad, la escalabilidad elástica, el aislamiento de fallos y el despliegue continuo. Estos principios son fundamentales para garantizar sistemas más flexibles, robustos y alineados con las demandas actuales.

En este marco, la investigación propone el diseño de un prototipo de arquitectura basada en microservicios, utilizando tecnologías como Spring Boot, Docker y Prometheus, junto con prácticas como API REST, monitoreo distribuido y patrones de resiliencia. Esta solución permite desacoplar funcionalidades, habilitar pruebas y despliegues independientes, escalar componentes según la demanda específica y mejorar sustancialmente la mantenibilidad y trazabilidad del sistema.

Por tanto, esta propuesta no solo atiende un problema real en contextos críticos como el de la Gestión Tributaria, sino que además ofrece una solución técnicamente viable, moderna y alineada con las mejores prácticas de la ingeniería de software contemporánea.

### Formulación del problema

🟦 Inicio - Enfoque central
“El problema central que motiva esta investigación es la falta de una arquitectura moderna, por lo que es conviniente preguntarse: ¿Cómo diseñar una arquitectura de microservicios que permita mejorar la escalabilidad y mantenibilidad del Proceso de Gestión Tributaria?”

🔧 Causas (lado izquierdo)
“Entre las principales causas del problema identificamos, en primer lugar, la arquitectura monolítica legada, que centraliza toda la lógica del sistema en un solo bloque, dificultando su evolución.”

“En segundo lugar, encontramos el fuerte acoplamiento entre módulos funcionales, lo que significa que las partes del sistema están estrechamente interconectadas, y cualquier cambio implica riesgos generalizados.”

“También se evidencia la falta de despliegue independiente por componente, lo cual impide actualizar o escalar partes específicas del sistema sin afectar el resto.”

“Y por último, la ausencia de herramientas de monitoreo y trazabilidad distribuida, lo que limita la visibilidad del comportamiento del sistema en tiempo real.”

⚠️ Consecuencias (lado derecho)

“Estas causas generan diversas consecuencias negativas para el proceso de Gestión Tributaria. Por ejemplo, un aumento del tiempo y costo de mantenimiento, ya que cualquier cambio requiere intervención sobre todo el sistema.”

“También se presenta un alto riesgo de fallos generalizados al modificar el sistema, lo que afecta la estabilidad del servicio.”

“Además, se observa lentitud en la implementación de nuevos requerimientos tributarios, lo cual compromete la capacidad de adaptación del sistema ante nuevas normativas.”

“Y finalmente, se produce una reducción en la calidad del servicio al contribuyente, afectando la experiencia y eficiencia en la atención.”

 Cierre
“En conjunto, estas causas y consecuencias justifican la necesidad de proponer una solución moderna y desacoplada. Por ello, esta investigación plantea un prototipo basado en microservicios como alternativa para optimizar la escalabilidad, mantenibilidad y adaptabilidad del proceso de Gestión Tributaria.”

🎤 Guion para exponer la lámina de Objetivos
🟦 Inicio: Introducción general
“En esta lámina se presentan los objetivos de la investigación, divididos en un objetivo general que guía todo el estudio, y cuatro objetivos específicos que definen las acciones concretas a realizar.”

🎯 Objetivo general
“El objetivo general de esta investigación es diseñar un prototipo de arquitectura de microservicios que permita mejorar los factores de escalabilidad y mantenibilidad del Proceso de Gestión Tributaria.”

“Este objetivo responde directamente a las limitaciones identificadas previamente en el sistema actual, y orienta la propuesta hacia una solución técnica viable.”

🔹 Objetivo específico 1: Marco teórico
“El primer objetivo específico es analizar el contexto evolutivo de la arquitectura de software, enfocándose en la comparación entre la arquitectura monolítica y la de microservicios. Esto permitirá construir un marco teórico sólido que fundamente la propuesta.”

🔹 Objetivo específico 2: Diseño del prototipo
“El segundo objetivo es diseñar un prototipo funcional de arquitectura de microservicios que incorpore servicios web como base tecnológica, y que garantice tanto la escalabilidad como la mantenibilidad.”

🔹 Objetivo específico 3: Comparación entre arquitecturas
“En tercer lugar, se plantea realizar un análisis técnico y funcional comparativo entre las arquitecturas de microservicios y monolítica, usando entornos controlados que permitan observar diferencias medibles en rendimiento, adaptabilidad y mantenibilidad.”

🔹 Objetivo específico 4: Evaluación del prototipo
“Finalmente, se busca evaluar la escalabilidad bajo demanda y la mantenibilidad del prototipo propuesto, utilizando herramientas de monitoreo para comprobar su rendimiento y su capacidad de gestión eficiente de recursos.”

🟦 Cierre
“Estos objetivos están alineados entre sí y responden directamente a la pregunta de investigación. A través de ellos, la tesis busca no solo proponer una solución arquitectónica, sino demostrar con evidencia técnica que dicha solución mejora el proceso de Gestión Tributaria.”

🎤 Guion para sustentar la lámina de la Hipótesis

🟦 Introducción breve

“A partir del análisis del problema, sus causas y consecuencias, y en coherencia con los objetivos planteados, se establece la siguiente hipótesis como base para validar esta investigación.”

📌 Lectura de la hipótesis

“Al implementar una arquitectura basada en microservicios en el proceso de gestión tributaria, se logrará una mejora en la escalabilidad y mantenibilidad del sistema.”

🔍 Explicación de su sentido

“Esta hipótesis parte de la premisa de que la arquitectura de microservicios, al ser modular, desacoplada y fácilmente escalable, representa una solución efectiva para superar las limitaciones técnicas del modelo monolítico actual.”

“Lo que se espera validar es que, al aplicar esta arquitectura en un entorno funcional —específicamente en el Proceso de Gestión Tributaria—, se evidencien mejoras tangibles en dos factores clave: escalabilidad, es decir, la capacidad del sistema para crecer de manera controlada; y mantenibilidad, que implica menor esfuerzo para modificar o corregir el sistema sin afectar su funcionamiento global.”

✅ Cierre

“Esta hipótesis será comprobada a través del diseño y evaluación de un prototipo funcional, cuyos resultados se comprobarán mediante pruebas técnicas, herramientas de monitoreo y análisis comparativo.”
