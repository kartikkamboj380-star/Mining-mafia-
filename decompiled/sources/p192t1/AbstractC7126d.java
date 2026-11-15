package p192t1;

import C.b;
import E.h;
import android.app.ActivityManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import androidx.lifecycle.AbstractC1164j;
import androidx.lifecycle.r;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParserException;
import p080i.a;

/* JADX INFO: renamed from: t1.d, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC7126d {
    public static final double a(Context context) {
        try {
            Object objI = b.i(context, ActivityManager.class);
            Intrinsics.c(objI);
            return ((ActivityManager) objI).isLowRamDevice() ? 0.15d : 0.2d;
        } catch (Exception unused) {
            return 0.2d;
        }
    }

    public static final Context b(Context context) {
        return context.getApplicationContext();
    }

    public static final Drawable c(Context context, int i10) {
        Drawable drawableB = a.b(context, i10);
        if (drawableB != null) {
            return drawableB;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final Drawable d(Resources resources, int i10, Resources.Theme theme) {
        Drawable drawableF = h.f(resources, i10, theme);
        if (drawableF != null) {
            return drawableF;
        }
        throw new IllegalStateException(("Invalid resource ID: " + i10).toString());
    }

    public static final AbstractC1164j e(Context context) {
        Object baseContext = context;
        while (!(baseContext instanceof r)) {
            if (!(baseContext instanceof ContextWrapper)) {
                return null;
            }
            baseContext = ((ContextWrapper) baseContext).getBaseContext();
        }
        return ((r) baseContext).getLifecycle();
    }

    public static final Drawable f(Context context, Resources resources, int i10) throws XmlPullParserException, IOException {
        XmlResourceParser xml = resources.getXml(i10);
        int next = xml.next();
        while (next != 2 && next != 1) {
            next = xml.next();
        }
        if (next == 2) {
            return d(resources, i10, context.getTheme());
        }
        throw new XmlPullParserException("No start tag found.");
    }

    public static final long g(Context context) {
        int largeMemoryClass;
        try {
            Object objI = b.i(context, ActivityManager.class);
            Intrinsics.c(objI);
            ActivityManager activityManager = (ActivityManager) objI;
            largeMemoryClass = (context.getApplicationInfo().flags & 1048576) != 0 ? activityManager.getLargeMemoryClass() : activityManager.getMemoryClass();
        } catch (Exception unused) {
            largeMemoryClass = IntBufferBatchMountItem.INSTRUCTION_UPDATE_EVENT_EMITTER;
        }
        return ((long) largeMemoryClass) * 1048576;
    }
}
