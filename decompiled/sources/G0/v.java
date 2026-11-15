package G0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f912b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f911a = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final ArrayList f913c = new ArrayList();

    public v(View view) {
        this.f912b = view;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return this.f912b == vVar.f912b && this.f911a.equals(vVar.f911a);
    }

    public int hashCode() {
        return (this.f912b.hashCode() * 31) + this.f911a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f912b + "\n") + "    values:";
        for (String str2 : this.f911a.keySet()) {
            str = str + "    " + str2 + ": " + this.f911a.get(str2) + "\n";
        }
        return str;
    }
}
