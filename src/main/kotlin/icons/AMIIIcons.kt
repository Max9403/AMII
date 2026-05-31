package icons

import com.intellij.openapi.util.IconLoader

private val classLoader = AMIIIcons::class.java.classLoader

object AMIIIcons {
  object Plugins {
    object Rider {
      val AMII = IconLoader.getIcon("/icons/plugins/amii-rider-extension.svg", classLoader)
    }
    object Android {
      val AMII = IconLoader.getIcon("/icons/plugins/amii-android-extension.svg", classLoader)
    }
  }

  @JvmField
  val PLUGIN_ICON = IconLoader.getIcon("/icons/plugin-tool-window.svg", classLoader)

  @JvmField
  val HEART = IconLoader.getIcon("/icons/heart.svg", classLoader)

  @JvmField
  val E1F44B = IconLoader.getIcon("/icons/emojis/1f44b.svg", classLoader)

  @JvmField
  val E1f648 = IconLoader.getIcon("/icons/emojis/1f648.svg", classLoader)

  val E1F60A = IconLoader.getIcon("/icons/emojis/1f60a.svg", classLoader)
  val E1F60C = IconLoader.getIcon("/icons/emojis/1f60c.svg", classLoader)
  val E1F60F = IconLoader.getIcon("/icons/emojis/1f60f.svg", classLoader)
  val E1F62D = IconLoader.getIcon("/icons/emojis/1f62d.svg", classLoader)
  val E1F92C = IconLoader.getIcon("/icons/emojis/1f92c.svg", classLoader)

  @JvmField
  val E1F609 = IconLoader.getIcon("/icons/emojis/1f609.svg", classLoader)
  val E1F611 = IconLoader.getIcon("/icons/emojis/1f611.svg", classLoader)
  val E1F612 = IconLoader.getIcon("/icons/emojis/1f612.svg", classLoader)
  val E1F620 = IconLoader.getIcon("/icons/emojis/1f620.svg", classLoader)
  val E1F632 = IconLoader.getIcon("/icons/emojis/1f632.svg", classLoader)

  @JvmField
  val E1F634 = IconLoader.getIcon("/icons/emojis/1f634.svg", classLoader)
  val E1F642 = IconLoader.getIcon("/icons/emojis/1f642.svg", classLoader)
  val E1F973 = IconLoader.getIcon("/icons/emojis/1f973.svg", classLoader)
  val MILD_DISAPPOINTMENT = IconLoader.getIcon("/icons/emojis/mildly_disappointed.svg", classLoader)
}
