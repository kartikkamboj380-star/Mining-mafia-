package P;

import android.view.accessibility.AccessibilityManager;

/* JADX INFO: renamed from: P.c, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0921c {

    /* JADX INFO: renamed from: P.c$a */
    public interface a {
        void onTouchExplorationStateChanged(boolean z9);
    }

    /* JADX INFO: renamed from: P.c$b */
    private static final class b implements AccessibilityManager.TouchExplorationStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final a f4644a;

        b(a aVar) {
            this.f4644a = aVar;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f4644a.equals(((b) obj).f4644a);
            }
            return false;
        }

        public int hashCode() {
            return this.f4644a.hashCode();
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public void onTouchExplorationStateChanged(boolean z9) {
            this.f4644a.onTouchExplorationStateChanged(z9);
        }
    }

    public static boolean a(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.addTouchExplorationStateChangeListener(new b(aVar));
    }

    public static boolean b(AccessibilityManager accessibilityManager, a aVar) {
        return accessibilityManager.removeTouchExplorationStateChangeListener(new b(aVar));
    }
}
