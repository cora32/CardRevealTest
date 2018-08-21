package ru.livli.cardrevealtest

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.transition.Transition
import kotlinx.android.synthetic.main.activity_card.*


class CardActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_card)

//        window.enterTransition = CardFragment.DetailsTransition()

//        val set = TransitionSet().apply {
//            addTransition(ChangeBounds())
//            addTransition(ChangeTransform().apply {
//                reparent = false
//                reparentWithOverlay = false
//            })
//            addTransition(ChangeImageTransform())
//        }
//        window.enterTransition = ChangeTransform().apply {
//            reparent = false
//            reparentWithOverlay = false
//        }
////        window.sharedElementEnterTransition = set
//
//        window.sharedElementEnterTransition = ChangeTransform().apply {
//            reparent = false
//            reparentWithOverlay = false
//        }
        window.sharedElementEnterTransition
                .addListener(object : Transition.TransitionListener {
                    override fun onTransitionStart(p0: Transition) {
                        val value = if (cv.radius != 1f) 1f else 100f
                        val animator = ObjectAnimator
                                .ofFloat(cv, "radius", value)
                        animator.duration = 350
                        animator.start()


//                        val anim = ValueAnimator.ofInt(iv.measuredHeight, 1000)
//                        anim.addUpdateListener { valueAnimator ->
//                            val value = valueAnimator.animatedValue as Int
//                            val layoutParams = iv.layoutParams
//                            layoutParams.height = value
//                            iv.layoutParams = layoutParams
//                        }
//                        anim.duration = 350
//                        anim.start()


                    }

                    override fun onTransitionEnd(p0: Transition) {
                    }

                    override fun onTransitionResume(p0: Transition) {
                    }

                    override fun onTransitionPause(p0: Transition) {
                    }

                    override fun onTransitionCancel(p0: Transition) {
                    }
                })
    }
}