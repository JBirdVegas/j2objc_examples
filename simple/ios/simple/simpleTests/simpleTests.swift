//
//  simpleTests.swift
//  simpleTests
//
//  Created by Quoc Dung Chu on 11/11/2015.
//
//

import XCTest
@testable import simple

class simpleTests: XCTestCase {
  
  //var loginInteractor: SPLoginInteractor?
  
  override func setUp() {
    super.setUp()
    //self.loginInteractor = SPLoginInteractor()
  }
  
  override func tearDown() {
    super.tearDown()
  }
  
  func testSuccess() {
    //self.loginInteractor!.createUserWithNSString("tom", withNSString: "tom pwd")
    
    //assert(self.loginInteractor!.loginWithNSString("tom", withNSString: "tom pwd") === SPLoginInteractor_LoginStateEnum_get_ERROR())
  }
  
  func testPerformanceExample() {
    // This is an example of a performance test case.
    self.measureBlock {
      // Put the code you want to measure the time of here.
    }
  }
  
}
