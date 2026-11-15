package com.bytedance.sdk.openadsdk.utils;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.bytedance.sdk.openadsdk.ApmHelper;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class wee {

    class kq implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ boolean bob;
        View kq = null;
        final /* synthetic */ ViewGroup oq;

        kq(ViewGroup viewGroup, boolean z9) {
            this.oq = viewGroup;
            this.bob = z9;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            try {
                oq oqVar = (oq) this.oq.getTag(520093765);
                if (this.kq == null) {
                    ViewGroup viewGroup = this.oq;
                    wee.oq(viewGroup, oqVar, (Integer) viewGroup.getTag(520093766), this.bob);
                    return;
                }
                Rect rect = new Rect();
                this.kq.getGlobalVisibleRect(rect);
                Rect rect2 = new Rect();
                this.oq.getGlobalVisibleRect(rect2);
                if (rect.contains(rect2)) {
                    if (oqVar != null) {
                        oqVar.kq(this.oq, false);
                    }
                    this.oq.setTag(520093763, Boolean.FALSE);
                } else {
                    if (oqVar != null) {
                        oqVar.kq(this.oq, true);
                    }
                    this.oq.setTag(520093763, Boolean.TRUE);
                }
            } catch (Exception e10) {
                ApmHelper.reportCustomError("onGlobalLayout exception " + this.oq.getTag(520093765), "ViewUtils", e10);
            }
        }
    }

    public interface oq {
        void kq();

        void kq(View view, boolean z9);

        void kq(boolean z9);

        void oq();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void oq(View view, oq oqVar, Integer num, boolean z9) {
        if (oqVar == null) {
            return;
        }
        if (num == null) {
            num = 0;
        }
        oqVar.kq(view, kq(view, num.intValue(), z9));
    }

    public static void kq(final ViewGroup viewGroup, boolean z9, int i10, final boolean z10, oq oqVar, List<ViewGroup> list) {
        viewGroup.setTag(520093765, oqVar);
        viewGroup.setTag(520093766, Integer.valueOf(i10));
        if (viewGroup.getTag(520093764) == Boolean.TRUE) {
            return;
        }
        final kq kqVar = new kq(viewGroup, z10);
        if (list != null && list.size() > 0) {
            for (int i11 = 0; i11 < list.size(); i11++) {
                list.get(i11).setOnHierarchyChangeListener(new ViewGroup.OnHierarchyChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.wee.1
                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewAdded(View view, View view2) {
                        kqVar.kq = view2;
                    }

                    @Override // android.view.ViewGroup.OnHierarchyChangeListener
                    public void onChildViewRemoved(View view, View view2) {
                        kqVar.kq = null;
                    }
                });
            }
        }
        viewGroup.getViewTreeObserver().addOnGlobalLayoutListener(kqVar);
        if (z9) {
            viewGroup.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: com.bytedance.sdk.openadsdk.utils.wee.2
                @Override // android.view.ViewTreeObserver.OnScrollChangedListener
                public void onScrollChanged() {
                    try {
                        oq oqVar2 = (oq) viewGroup.getTag(520093765);
                        ViewGroup viewGroup2 = viewGroup;
                        wee.oq(viewGroup2, oqVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    } catch (Exception e10) {
                        ApmHelper.reportCustomError("onScrollChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                    }
                }
            });
        }
        viewGroup.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.wee.3
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public void onWindowFocusChanged(boolean z11) {
                try {
                    oq oqVar2 = (oq) viewGroup.getTag(520093765);
                    if (oqVar2 != null) {
                        oqVar2.kq(z11);
                        ViewGroup viewGroup2 = viewGroup;
                        wee.oq(viewGroup2, oqVar2, (Integer) viewGroup2.getTag(520093766), z10);
                    }
                } catch (Exception e10) {
                    ApmHelper.reportCustomError("onWindowFocusChanged exception " + viewGroup.getTag(520093765), "ViewUtils", e10);
                }
            }
        });
        viewGroup.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.bytedance.sdk.openadsdk.utils.wee.4
            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                oq oqVar2 = (oq) viewGroup.getTag(520093765);
                if (oqVar2 != null) {
                    oqVar2.kq();
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                oq oqVar2 = (oq) viewGroup.getTag(520093765);
                if (oqVar2 != null) {
                    oqVar2.oq();
                }
            }
        });
        viewGroup.setTag(520093764, Boolean.TRUE);
    }

    private static boolean kq(View view, int i10, boolean z9) {
        return com.bytedance.sdk.openadsdk.core.xn.kq(view, 20, i10, z9);
    }

    public static ArrayList<View> kq(View view, int i10) {
        ArrayList<View> arrayList = new ArrayList<>();
        if (view != null && i10 > 0) {
            Object parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) parent;
                for (int iIndexOfChild = viewGroup.indexOfChild(view) + 1; iIndexOfChild < viewGroup.getChildCount(); iIndexOfChild++) {
                    arrayList.add(viewGroup.getChildAt(iIndexOfChild));
                }
            }
            if (i10 > 1 && parent != null) {
                arrayList.addAll(kq((View) parent, i10 - 1));
            }
        }
        return arrayList;
    }

    public static View kq(View view, Class<? extends View> cls) {
        Object parent;
        if (view == null || cls == null || (parent = view.getParent()) == null) {
            return null;
        }
        if (cls.isInstance(parent)) {
            return (View) parent;
        }
        return kq((View) parent, cls);
    }
}
