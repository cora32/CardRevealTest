package ru.livli.cardrevealtest

import android.animation.ObjectAnimator
import android.os.Bundle
import android.support.transition.ChangeBounds
import android.support.transition.ChangeImageTransform
import android.support.transition.ChangeTransform
import android.support.transition.TransitionSet
import android.support.v4.app.Fragment
import android.support.v7.widget.CardView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_card.*

class CardFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_card, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val animator = ObjectAnimator
                .ofFloat(cv, "radius", if (cv.radius != 50f) 50f else 100f)
        animator.duration = 950
        animator.start()
        sharedElementReturnTransition = CardFragment.DetailsTransition2(cv).setDuration(1000)


//        sharedElementEnterTransition = DetailsTransition()
//        enterTransition = Fade()
//        exitTransition = Fade()
//        sharedElementReturnTransition = DetailsTransition(cv)

//        startPostponedEnterTransition()
//        pendingAnimation?.invoke()
//        sharedElementEnterTransition
//                ?.addListener(object : Transition.TransitionListener {
//                    var opens = true
//                    override fun onTransitionStart(p0: Transition?) {
//                        val animator = ObjectAnimator
//                                .ofFloat(cv, "radius", if(opens) 0f else 100f)
//                        animator.duration = 350
//                        animator.start()
//                        opens = !opens
//                    }
//
//                    override fun onTransitionEnd(p0: Transition?) {
//                    }
//
//                    override fun onTransitionResume(p0: Transition?) {
//                    }
//
//                    override fun onTransitionPause(p0: Transition?) {
//                    }
//
//                    override fun onTransitionCancel(p0: Transition?) {
//                    }
//                })
    }

    //    fun startAnimation(ivFrom: View) {
//        sharedElementEnterTransition = MainFragment.DetailsTransition(cv)
//        enterTransition = Fade()
//        exitTransition = Fade()
//        sharedElementReturnTransition = MainFragment.DetailsTransition(cv)
//
//        fragmentManager?.let {
//            it.beginTransaction()
////                        .addSharedElement(cv, "cvTo")
//                    .addSharedElement(ivFrom, "ivTo")
//                    .replace(R.id.container, this)
//                    .addToBackStack(null)
//                    .commit()
//        }
//    }

    class DetailsTransition(val cv: CardView? = null) : TransitionSet() {
        init {
            ordering = ORDERING_TOGETHER
            addTransition(ChangeBounds())
            addTransition(ChangeTransform().apply {
                reparent = false
                reparentWithOverlay = false
            })
            addTransition(ChangeImageTransform().apply {
                //                interpolator = AccelerateInterpolator()
            })
//            addListener(object : TransitionListener {
//                override fun onTransitionEnd(p0: android.support.transition.Transition) {
//
//                }
//
//                override fun onTransitionResume(p0: android.support.transition.Transition) {
//                }
//
//                override fun onTransitionPause(p0: android.support.transition.Transition) {
//                }
//
//                override fun onTransitionCancel(p0: android.support.transition.Transition) {
//                }
//
//                override fun onTransitionStart(p0: android.support.transition.Transition) {
//                    cv?.let { cv ->
//                        val animator = ObjectAnimator
//                                .ofFloat(cv, "radius", if (cv.radius != 0f) 0f else 100f)
//                        animator.duration = 350
//                        animator.start()
//                    }
//                }
//
//            })
        }
    }

    class DetailsTransition2(cv: CardView?) : TransitionSet() {
        init {
            ordering = ORDERING_TOGETHER
            addTransition(ChangeBounds())
            addTransition(ChangeTransform().apply {
                reparent = true
                reparentWithOverlay = true
            })
            addTransition(ChangeImageTransform())
            addListener(object : TransitionListener {
                override fun onTransitionEnd(p0: android.support.transition.Transition) {

                }

                override fun onTransitionResume(p0: android.support.transition.Transition) {
                }

                override fun onTransitionPause(p0: android.support.transition.Transition) {
                }

                override fun onTransitionCancel(p0: android.support.transition.Transition) {
                }

                override fun onTransitionStart(p0: android.support.transition.Transition) {
                    cv?.let { cv ->
                        val value = 100f
                        val animator = ObjectAnimator
                                .ofFloat(cv, "radius", value)
                        animator.duration = 950
                        animator.start()
                    }
                }

            })
        }
    }
}