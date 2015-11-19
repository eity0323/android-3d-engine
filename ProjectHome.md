## Note ##

Since we don't have enough time to continue this project for now,
if you are interested to be involved in this project, please feel free to contact us by email **mymyoux at gmail.com** !


## Description ##

3D engine for android 2.2 and upper :

- For all OpenGL ES 2.0 android devices

- VBOs support for higher performances

- Easy sensors interface


Sample project using the engine included :

- Exploration of a house. Video : http://www.youtube.com/watch?v=dsAgfo7zORw

---

## How to use this Engine : ##
  1. Download sources
  1. Add dimyoux folder to your Android project
  1. Your main _Activity_ has to extend _**EngineActivity**_ instead of Activity
  1. You can now override these functions :
  * **preinitScene** Called before creating the OpenGL Surface
  * **onSurfaceCreated** Called when the OpenGL Surface is ready
  * **onSurfaceChanged** Called when the OpenGL Surface is modified (switch between applications, possibly when you switch between portrait and landscape mode...)
  * **onDrawFrame** Called each OpenGL Frame
  * You have access to the Scene graph through the **root** variable
> 
---

### Check out HouseActivity example to see how work: ###
  * Cameras
  * Lights
  * Saves
  * Parsers
  * Sensors