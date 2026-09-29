# PROYECTO TP1 - Sistemas de Gestión de la Configuración

En este proyecto utilizamos GitHub como herramienta de control de versiones y GitFlow como flujo de ramificaciones de Git.

## VERSIONES

- **0.1**: Versión inicial en desarrollo.
- **1.0.0**: Primera versión liberada a producción.
- **1.0.1**: Versión con corrección de un error en producción.
- **1.1.0**: Versión con una nueva funcionalidad menor.

## DOCUMENTACIÓN DE PULL REQUEST

Si una persona externa al equipo realiza una modificación, debe crear un Pull Request indicando:

- Descripción del cambio.
- Justificación del cambio.
- Impacto en otras áreas del código.
- Archivos modificados.
- Forma de probar el cambio.

GitHub permite utilizar plantillas de Pull Request para solicitar esta información de manera estandarizada.

En este proyecto utilizamos:

- `.github/pull_request_template.md` para definir la información requerida en cada Pull Request.
- `.github/CODEOWNERS` para asignar responsables de revisión.
- `.github/workflows/ci.yml` para ejecutar automáticamente las validaciones de integración continua.
- `.gitignore` para evitar versionar archivos locales o generados automáticamente.

De esta forma se mantiene la trazabilidad de los cambios realizados y se facilita su revisión antes de incorporarlos al proyecto.
