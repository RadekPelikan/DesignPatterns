# Návrhové vzory

#### Singleton

Instance třídy je uložena v jejím statickém atributu

Používá se pro práci s globálními proměnnými a funkcemi

Nevýhoda je, že více procesů může upravovat instanci ve stejný čas a může dojít k nechtěnnému změnění dat

#### Factory

Předdefinované funkce, které samy vytváří různé instance tříd a následně je vracejí

Funguje vlastně něco jako Enum

#### Builder

Třída Builder je pro vytváření určité instance

Výhody jsou:
- Možnost definovat jen vlastnosti, které chceme
- Zbytek vlastností může mít základní hodnotu
- řetězení metod pro nastavnování vlastností

Nevýhodou je pracné vytváření builderu u větších tříd

### Zdroje

#### [refactoring.guru](ttps://refactoring.guru/design-patterns)