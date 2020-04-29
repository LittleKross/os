package main

import (
	"fmt"
	"reflect"
	"time"
)

func makeThread() {
	fmt.Println("Active Thread in GO")
}

func main() {
	fmt.Println("main execution started")

	// GO Routine to represent thread in GO Language Engine
	go makeThread()

	typeVar := reflect.TypeOf(makeThread)

	fmt.Println("Type:", typeVar)

	valVar := reflect.ValueOf(makeThread)

	fmt.Println("Value:", valVar)

	fmt.Println("Settablility of Thread:", valVar.CanSet())

	// Test Execution in Go Routine
	time.Sleep(25 * time.Millisecond)

	fmt.Println("main exection stopped")
}
