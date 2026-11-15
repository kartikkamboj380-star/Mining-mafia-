package p070h;

import android.content.res.Resources;
import android.os.Build;
import android.util.Log;
import android.util.LongSparseArray;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: classes.dex */
abstract class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Field f44700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f44701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Class f44702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f44703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Field f44704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f44705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Field f44706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static boolean f44707h;

    static void a(Resources resources) {
        if (Build.VERSION.SDK_INT >= 28) {
            return;
        }
        b(resources);
    }

    private static void b(Resources resources) {
        Object obj;
        if (!f44707h) {
            try {
                Field declaredField = Resources.class.getDeclaredField("mResourcesImpl");
                f44706g = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", e10);
            }
            f44707h = true;
        }
        Field field = f44706g;
        if (field == null) {
            return;
        }
        Object obj2 = null;
        try {
            obj = field.get(resources);
        } catch (IllegalAccessException e11) {
            Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", e11);
            obj = null;
        }
        if (obj == null) {
            return;
        }
        if (!f44701b) {
            try {
                Field declaredField2 = obj.getClass().getDeclaredField("mDrawableCache");
                f44700a = declaredField2;
                declaredField2.setAccessible(true);
            } catch (NoSuchFieldException e12) {
                Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", e12);
            }
            f44701b = true;
        }
        Field field2 = f44700a;
        if (field2 != null) {
            try {
                obj2 = field2.get(obj);
            } catch (IllegalAccessException e13) {
                Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", e13);
            }
        }
        if (obj2 != null) {
            c(obj2);
        }
    }

    private static void c(Object obj) {
        LongSparseArray longSparseArray;
        if (!f44703d) {
            try {
                f44702c = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException e10) {
                Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", e10);
            }
            f44703d = true;
        }
        Class cls = f44702c;
        if (cls == null) {
            return;
        }
        if (!f44705f) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                f44704e = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e11) {
                Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", e11);
            }
            f44705f = true;
        }
        Field field = f44704e;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException e12) {
            Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", e12);
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }
}
