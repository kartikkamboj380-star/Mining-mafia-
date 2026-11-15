package androidx.appcompat.widget;

import android.R;
import android.graphics.Insets;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class O {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f7917a = {R.attr.state_checked};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f7918b = new int[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Rect f7919c = new Rect();

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final boolean f7920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Method f7921b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final Field f7922c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Field f7923d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final Field f7924e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final Field f7925f;

        /* JADX WARN: Code duplicated, block: B:25:0x004a  */
        /* JADX WARN: Code duplicated, block: B:26:0x0057  */
        static {
            Method method;
            Field field;
            Field field2;
            Field field3;
            Field field4;
            boolean z9;
            try {
                Class<?> cls = Class.forName("android.graphics.Insets");
                method = Drawable.class.getMethod("getOpticalInsets", null);
                try {
                    field = cls.getField("left");
                    try {
                        field2 = cls.getField("top");
                        try {
                            field3 = cls.getField("right");
                            try {
                                field4 = cls.getField("bottom");
                                z9 = true;
                            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused) {
                                field4 = null;
                                z9 = false;
                            }
                        } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused2) {
                            field3 = null;
                        }
                    } catch (ClassNotFoundException unused3) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z9 = false;
                        if (z9) {
                            f7921b = method;
                            f7922c = field;
                            f7923d = field2;
                            f7924e = field3;
                            f7925f = field4;
                            f7920a = true;
                            return;
                        }
                        f7921b = null;
                        f7922c = null;
                        f7923d = null;
                        f7924e = null;
                        f7925f = null;
                        f7920a = false;
                    } catch (NoSuchFieldException unused4) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z9 = false;
                        if (z9) {
                            f7921b = method;
                            f7922c = field;
                            f7923d = field2;
                            f7924e = field3;
                            f7925f = field4;
                            f7920a = true;
                            return;
                        }
                        f7921b = null;
                        f7922c = null;
                        f7923d = null;
                        f7924e = null;
                        f7925f = null;
                        f7920a = false;
                    } catch (NoSuchMethodException unused5) {
                        field2 = null;
                        field3 = field2;
                        field4 = null;
                        z9 = false;
                        if (z9) {
                            f7921b = method;
                            f7922c = field;
                            f7923d = field2;
                            f7924e = field3;
                            f7925f = field4;
                            f7920a = true;
                            return;
                        }
                        f7921b = null;
                        f7922c = null;
                        f7923d = null;
                        f7924e = null;
                        f7925f = null;
                        f7920a = false;
                    }
                } catch (ClassNotFoundException unused6) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z9 = false;
                    if (z9) {
                        f7921b = method;
                        f7922c = field;
                        f7923d = field2;
                        f7924e = field3;
                        f7925f = field4;
                        f7920a = true;
                        return;
                    }
                    f7921b = null;
                    f7922c = null;
                    f7923d = null;
                    f7924e = null;
                    f7925f = null;
                    f7920a = false;
                } catch (NoSuchFieldException unused7) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z9 = false;
                    if (z9) {
                        f7921b = method;
                        f7922c = field;
                        f7923d = field2;
                        f7924e = field3;
                        f7925f = field4;
                        f7920a = true;
                        return;
                    }
                    f7921b = null;
                    f7922c = null;
                    f7923d = null;
                    f7924e = null;
                    f7925f = null;
                    f7920a = false;
                } catch (NoSuchMethodException unused8) {
                    field = null;
                    field2 = field;
                    field3 = field2;
                    field4 = null;
                    z9 = false;
                    if (z9) {
                        f7921b = method;
                        f7922c = field;
                        f7923d = field2;
                        f7924e = field3;
                        f7925f = field4;
                        f7920a = true;
                        return;
                    }
                    f7921b = null;
                    f7922c = null;
                    f7923d = null;
                    f7924e = null;
                    f7925f = null;
                    f7920a = false;
                }
            } catch (ClassNotFoundException unused9) {
                method = null;
                field = null;
            } catch (NoSuchFieldException unused10) {
                method = null;
                field = null;
            } catch (NoSuchMethodException unused11) {
                method = null;
                field = null;
            }
            if (z9) {
                f7921b = method;
                f7922c = field;
                f7923d = field2;
                f7924e = field3;
                f7925f = field4;
                f7920a = true;
                return;
            }
            f7921b = null;
            f7922c = null;
            f7923d = null;
            f7924e = null;
            f7925f = null;
            f7920a = false;
        }

        static Rect a(Drawable drawable) {
            if (Build.VERSION.SDK_INT < 29 && f7920a) {
                try {
                    Object objInvoke = f7921b.invoke(drawable, null);
                    if (objInvoke != null) {
                        return new Rect(f7922c.getInt(objInvoke), f7923d.getInt(objInvoke), f7924e.getInt(objInvoke), f7925f.getInt(objInvoke));
                    }
                } catch (IllegalAccessException | InvocationTargetException unused) {
                }
            }
            return O.f7919c;
        }
    }

    static class b {
        static Insets a(Drawable drawable) {
            return drawable.getOpticalInsets();
        }
    }

    public static boolean a(Drawable drawable) {
        return true;
    }

    static void b(Drawable drawable) {
        String name = drawable.getClass().getName();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 < 29 || i10 >= 31 || !"android.graphics.drawable.ColorStateListDrawable".equals(name)) {
            return;
        }
        c(drawable);
    }

    private static void c(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(f7917a);
        } else {
            drawable.setState(f7918b);
        }
        drawable.setState(state);
    }

    public static Rect d(Drawable drawable) {
        if (Build.VERSION.SDK_INT < 29) {
            return a.a(G.a.q(drawable));
        }
        Insets insetsA = b.a(drawable);
        return new Rect(insetsA.left, insetsA.top, insetsA.right, insetsA.bottom);
    }

    public static PorterDuff.Mode e(int i10, PorterDuff.Mode mode) {
        if (i10 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i10 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i10 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i10) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }
}
