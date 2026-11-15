package com.bytedance.sdk.component.utils;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.view.View;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
public class oq {
    private static kq kq;

    public interface kq {
        ExecutorService bob();

        boolean kq();

        boolean oq();
    }

    /* JADX INFO: renamed from: com.bytedance.sdk.component.utils.oq$oq, reason: collision with other inner class name */
    public interface InterfaceC0259oq {
        void kq();

        void kq(Throwable th);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean bob(Context context, Intent intent, InterfaceC0259oq interfaceC0259oq) {
        if (context != null && intent != null) {
            try {
                if (!(context instanceof Activity)) {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                if (interfaceC0259oq == null) {
                    return true;
                }
                interfaceC0259oq.kq();
                return true;
            } catch (Throwable th) {
                if (interfaceC0259oq != null) {
                    interfaceC0259oq.kq(th);
                }
            }
        }
        return false;
    }

    public static void kq(kq kqVar) {
        kq = kqVar;
    }

    public static void kq(final Context context, final Intent intent, final InterfaceC0259oq interfaceC0259oq) {
        ExecutorService executorServiceBob;
        kq kqVar = kq;
        if (kqVar == null || !kqVar.oq() || (executorServiceBob = kq.bob()) == null) {
            bob(context, intent, interfaceC0259oq);
        } else {
            executorServiceBob.execute(new com.bytedance.sdk.component.syt.syt("startAct") { // from class: com.bytedance.sdk.component.utils.oq.1
                @Override // java.lang.Runnable
                public void run() {
                    oq.bob(context, intent, interfaceC0259oq);
                }
            });
        }
    }

    public static boolean kq(final Context context, final Intent intent, final InterfaceC0259oq interfaceC0259oq, boolean z9) {
        kq kqVar;
        ExecutorService executorServiceBob;
        if (z9 && (kqVar = kq) != null && kqVar.kq() && (executorServiceBob = kq.bob()) != null) {
            executorServiceBob.execute(new com.bytedance.sdk.component.syt.syt("startAct") { // from class: com.bytedance.sdk.component.utils.oq.2
                @Override // java.lang.Runnable
                public void run() {
                    oq.bob(context, intent, interfaceC0259oq);
                }
            });
            return true;
        }
        return bob(context, intent, interfaceC0259oq);
    }

    public static Activity kq(View view) {
        View viewFindViewById;
        Context context;
        if (view == null) {
            return null;
        }
        Context context2 = view.getContext();
        if (context2 instanceof Activity) {
            return (Activity) context2;
        }
        View rootView = view.getRootView();
        if (rootView == null || (viewFindViewById = rootView.findViewById(R.id.content)) == null || (context = viewFindViewById.getContext()) == null) {
            return null;
        }
        if (context instanceof Activity) {
            return (Activity) context;
        }
        if (context instanceof ContextWrapper) {
            Context baseContext = ((ContextWrapper) context).getBaseContext();
            if (baseContext instanceof Activity) {
                return (Activity) baseContext;
            }
        }
        return null;
    }

    public static boolean kq(Activity activity) {
        return activity == null || activity.isFinishing() || activity.isDestroyed();
    }
}
