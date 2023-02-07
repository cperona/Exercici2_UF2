# Exercici2_UF2

L'error era declarar dos embedded dins de la mateixa entitat. El problema és que hibernate intenta inserir
a la base de dades diverses columnes amb el mateix nom i per tant, salta un error.

Per solucionar l'error podem sobreescriure els atributs de l'embeddable amb l'anotació "@AttributeOverride". Als 
atributs del primer embedded els posarem un nom diferent dels del segon. Així no saltarà error.
S'escriuran amb noms diferents a la base de dades.