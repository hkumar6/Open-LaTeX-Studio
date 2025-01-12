/*                    
 * Copyright (c) 2015 Sebastian Brudzinski
 * 
 * See the file LICENSE for copying permission.
 */
package latexstudio.editor;

import java.io.File;
import latexstudio.editor.remote.DbxState;

/**
 *
 * @author Andy DESK
 */
public class EditorState {
    
    private boolean dirty;
    private boolean modified;
    private boolean previewDisplayed;
    private boolean spellCheckActive;   
    private File currentFile;
    private DbxState dbxState;
    
    public EditorState() {
        dirty = false;
        modified = false;
        previewDisplayed = true;
        spellCheckActive = false;
    }

    public boolean isDirty() {
        return dirty;
    }

    public boolean isModified() {
        return modified;
    }

    public boolean isPreviewDisplayed() {
        return previewDisplayed;
    }
           
    public boolean isSpellCheckActive() {
        return spellCheckActive;
    }

    public File getCurrentFile() {
        return currentFile;
    }

    public DbxState getDbxState() {
        return dbxState;
    }

    public void setDirty(boolean dirty) {
        this.dirty = dirty;
    }

    public void setModified(boolean modified) {
        this.modified = modified;
    }

    public void setPreviewDisplayed(boolean previewDisplayed) {
        this.previewDisplayed = previewDisplayed;
    }

    public void setSpellCheckActive(boolean spellCheckActive) {
        this.spellCheckActive = spellCheckActive;
    }

    public void setCurrentFile(File currentFile) {
        this.currentFile = currentFile;
    }

    public void setDbxState(DbxState dbxState) {
        this.dbxState = dbxState;
    }
}