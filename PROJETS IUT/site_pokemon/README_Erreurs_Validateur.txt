Lors du passage des fichier console.html et createur.html deux erreurs récurentes vont se propager :
- Element div not allowed as child of element button in this context. 
- The element a must not appear as a descendant of the button element.

Ces deux erreurs sont déclenché par l'utilisation d'une balise bouton afin d'ouvrir nos div. En effet, la balise <buton> ne doit théoriquement contenir que des Inline Elements tels que <a> <img> ou <span>, or <div> est un élément block
Elle ne peut malheureusement pas être évitée du fait de l'impossibilité d'utiliser le javascript au cours de ce projet. 

Nous nous excusons pour ce dérangement.
