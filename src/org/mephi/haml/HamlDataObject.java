/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.mephi.haml;

import java.io.IOException;
import org.netbeans.core.spi.multiview.MultiViewElement;
import org.netbeans.core.spi.multiview.text.MultiViewEditorElement;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.awt.ActionReferences;
import org.openide.filesystems.FileObject;
import org.openide.filesystems.MIMEResolver;
import org.openide.loaders.DataNode;
import org.openide.loaders.DataObject;
import org.openide.loaders.DataObjectExistsException;
import org.openide.loaders.MultiDataObject;
import org.openide.loaders.MultiFileLoader;
import org.openide.nodes.Children;
import org.openide.nodes.CookieSet;
import org.openide.nodes.Node;
import org.openide.text.DataEditorSupport;
import org.openide.util.Lookup;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;

//@Messages({
//    "LBL_Haml_LOADER=Files of Haml"
//})
//@MIMEResolver.ExtensionRegistration(
//        displayName = "#LBL_Haml_LOADER",
//        mimeType = "text/x-haml",
//        extension = {"haml"}
//)
//@DataObject.Registration(
//        mimeType = "text/x-haml",
//        iconBase = "org/mephi/haml/avatar_a1e59e176cba_16.png",
//        displayName = "#LBL_Haml_LOADER",
//        position = 300
//)
//@ActionReferences({
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.OpenAction"),
//            position = 100,
//            separatorAfter = 200
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "Edit", id = "org.openide.actions.CutAction"),
//            position = 300
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "Edit", id = "org.openide.actions.CopyAction"),
//            position = 400,
//            separatorAfter = 500
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "Edit", id = "org.openide.actions.DeleteAction"),
//            position = 600
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.RenameAction"),
//            position = 700,
//            separatorAfter = 800
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.SaveAsTemplateAction"),
//            position = 900,
//            separatorAfter = 1000
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.FileSystemAction"),
//            position = 1100,
//            separatorAfter = 1200
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.ToolsAction"),
//            position = 1300
//    ),
//    @ActionReference(
//            path = "Loaders/text/x-haml/Actions",
//            id = @ActionID(category = "System", id = "org.openide.actions.PropertiesAction"),
//            position = 1400
//    )
//})
//public class HamlDataObject extends MultiDataObject {
//
//    public HamlDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
//        super(pf, loader);
//        registerEditor("text/x-haml", true);
//    }
//
//    @Override
//    protected int associateLookup() {
//        return 1;
//    }
//
//    @MultiViewElement.Registration(
//            displayName = "#LBL_Haml_EDITOR",
//            iconBase = "org/mephi/haml/avatar_a1e59e176cba_16.png",
//            mimeType = "text/x-haml",
//            persistenceType = TopComponent.PERSISTENCE_ONLY_OPENED,
//            preferredID = "Haml",
//            position = 1000
//    )
//    @Messages("LBL_Haml_EDITOR=Source")
//    public static MultiViewEditorElement createEditor(Lookup lkp) {
//        return new MultiViewEditorElement(lkp);
//    }
//
//}

public class HamlDataObject extends MultiDataObject {

	public HamlDataObject(FileObject pf, MultiFileLoader loader) throws DataObjectExistsException, IOException {
		super(pf, loader);
		CookieSet cookies = getCookieSet();
		cookies.add((Node.Cookie) DataEditorSupport.create(this, getPrimaryEntry(), cookies));
	}

	@Override
	protected Node createNodeDelegate() {
		return new DataNode(this, Children.LEAF, getLookup());
	}

	@Override
	public Lookup getLookup() {
		return getCookieSet().getLookup();
	}
}
