package androidx.core.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class z implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ArrayList f9297a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f9298b;

    public interface a {
        Intent b();
    }

    private z(Context context) {
        this.f9298b = context;
    }

    public static z e(Context context) {
        return new z(context);
    }

    public z a(Intent intent) {
        this.f9297a.add(intent);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z b(Activity activity) {
        Intent intentB = activity instanceof a ? ((a) activity).b() : null;
        if (intentB == null) {
            intentB = l.a(activity);
        }
        if (intentB != null) {
            ComponentName component = intentB.getComponent();
            if (component == null) {
                component = intentB.resolveActivity(this.f9298b.getPackageManager());
            }
            d(component);
            a(intentB);
        }
        return this;
    }

    public z d(ComponentName componentName) {
        int size = this.f9297a.size();
        try {
            Intent intentB = l.b(this.f9298b, componentName);
            while (intentB != null) {
                this.f9297a.add(size, intentB);
                intentB = l.b(this.f9298b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e10);
        }
    }

    public void g() {
        i(null);
    }

    public void i(Bundle bundle) {
        if (this.f9297a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f9297a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (C.b.m(this.f9298b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f9298b.startActivity(intent);
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f9297a.iterator();
    }
}
