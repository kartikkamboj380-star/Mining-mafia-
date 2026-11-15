package G0;

import android.graphics.Matrix;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f758a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Field f759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f760c;

    static class a {
        static float a(View view) {
            return view.getTransitionAlpha();
        }

        static void b(View view, float f10) {
            view.setTransitionAlpha(f10);
        }
    }

    B() {
    }

    public float b(View view) {
        if (f758a) {
            try {
                return a.a(view);
            } catch (NoSuchMethodError unused) {
                f758a = false;
            }
        }
        return view.getAlpha();
    }

    public abstract void d(View view, int i10, int i11, int i12, int i13);

    public void e(View view, float f10) {
        if (f758a) {
            try {
                a.b(view, f10);
                return;
            } catch (NoSuchMethodError unused) {
                f758a = false;
            }
        }
        view.setAlpha(f10);
    }

    public void f(View view, int i10) {
        if (!f760c) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                f759b = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            f760c = true;
        }
        Field field = f759b;
        if (field != null) {
            try {
                f759b.setInt(view, i10 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public abstract void g(View view, Matrix matrix);

    public abstract void h(View view, Matrix matrix);

    public void a(View view) {
    }

    public void c(View view) {
    }
}
